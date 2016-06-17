package oliver.test.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {

	public static Connection getConnection(){
		String driver = "com.sybase.jdbc2.jdbc.SybDataSource";
		String url = "jdbc:sybase:Tds:hydev.hyvesolutions.org:6100/CIS";
		String user = "itandyj";
		String password = "report";
		try{
			Class.forName(driver) ;   
			Connection connection = DriverManager.getConnection(url, user, password);	
			return connection;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getSQL(String sqlId){
		Properties properties = new Properties();
		try {
			properties.load(DBUtil.class.getClassLoader().getResourceAsStream("sql.properties"));
			return properties.getProperty(sqlId);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
