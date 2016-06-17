package oliver.demo.plugin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import oliver.demo.common.util.Utils;

@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class}),
	@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})
//@Intercepts({@Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })})
public class SybasePagePlugin implements PagePlugin {

	private ThreadLocal<Integer> totalLocal = new ThreadLocal<Integer>();
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		
		if(invocation.getTarget() instanceof StatementHandler){
			StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
			MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);  
            /*while (metaStatementHandler.hasGetter("h")) {  
                Object object = metaStatementHandler.getValue("h");  
                metaStatementHandler = SystemMetaObject.forObject(object);  
            }  
            while (metaStatementHandler.hasGetter("target")) {  
                Object object = metaStatementHandler.getValue("target");  
                metaStatementHandler = SystemMetaObject.forObject(object);  
            }*/  
            MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");  
            
            String id = mappedStatement.getId();
            String methodName = new Vector<String>(Arrays.asList(id.split("\\."))).lastElement();
            if(!"page".equals(methodName)){
            	totalLocal.set(0);
            	return invocation.proceed();
            }
            
            if(!(statementHandler.getParameterHandler().getParameterObject() instanceof Map)){
            	totalLocal.set(0);
            	return invocation.proceed();
            }
            Map params = (Map) statementHandler.getParameterHandler().getParameterObject();
            /*Iterator it = params.entrySet().iterator();
            while(it.hasNext()){
            	Entry entry = (Entry) it.next();
            	System.out.println(entry.getKey() + "= " + entry.getValue());
            }*/
            
            int rows = Utils.toInteger(params.get("rows"));
            int page = Utils.toInteger(params.get("page"));
            int top  = rows * ( page - 1);
            
            BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");  
            String sql = boundSql.getSql(); 
            String fromSubSql = sql.substring(sql.indexOf("from"), sql.indexOf("order"));
            StringBuffer countSql = new StringBuffer();
            countSql.append("select count(*) ");
            countSql.append(fromSubSql);
            
            StringBuffer topSql = new StringBuffer();
            topSql.append("select top");
            topSql.append(" ");
            topSql.append(top);
            //hard code set identity is mfg_proj_id
            topSql.append(" mfg_proj_id");
            topSql.append(" ");
            topSql.append(fromSubSql);
           
            Connection connection = (Connection) invocation.getArgs()[0];
            Statement statement = connection.createStatement();
            ResultSet rs0 = statement.executeQuery(countSql.toString());
            int totalCount = rs0.next() ? rs0.getInt(1) : 0;
            totalLocal.set(totalCount);
            
            ResultSet rs1 = statement.executeQuery(topSql.toString());
            List<Integer> list = new ArrayList<Integer>();
            while(rs1.next()){
            	list.add(rs1.getInt(1));
            }
            
            int beginIndex = Collections.max(list);
            params.put("beginIndex", beginIndex);
//            StringBuffer pageSql = new StringBuffer();
//            metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);  
//            Connection connection = (Connection) invocation.getArgs()[0];  
            return invocation.proceed();
        } 
		
		if (invocation.getTarget() instanceof ResultSetHandler) {  
            Object rs = invocation.proceed();
            if(totalLocal.get() > 0 && (rs instanceof List)){
            	Map map = new HashMap();
            	map.put("rows", rs);
            	map.put("total", totalLocal.get());
            }
            return rs;  
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}

	@Override
	public int pageTotal() {
		return totalLocal.get();
	}

}
