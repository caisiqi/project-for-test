package oliver.demo.common.util.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import oliver.demo.common.util.sql.api.TableInfo;

public class DBHelper {

	public static Connection getSybaseConnection() {
		String driver = "com.sybase.jdbc2.jdbc.SybDataSource";
		String url = "jdbc:sybase:Tds:hydev.hyvesolutions.org:6100/CIS";
		String username = "itandyj";
		String password = "report";
		return getConnection(driver, url, username, password);
	}
	
	public static Connection getMysqlConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.87.228:3306/test";
		String username = "root";
		String password = "root";
		return getConnection(driver, url, username, password);
	}
	
	public static List<TableInfo> getSybaseSyncInfo() {
		
		List<TableInfo> list = new ArrayList<TableInfo>();
		return list;
	}
	
	public static List<TableInfo> getMysqlSyncInfo() {
		
		List<TableInfo> list = new ArrayList<TableInfo>();
		return list;
	}
	
	private static Connection getConnection(String driver, String url, String username, String password) {
		try{
			Class.forName(driver) ;   
			Connection connection = DriverManager.getConnection(url, username, password);	
			return connection;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
