package oliver.demo.common.util.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Just for test
 * Added by oliver at 2015/12/10
 * 
 */
public class DDLMain {
	
	public static void main(String[] args) {
		
		Connection conn = DBHelper.getMysqlConnection();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("desc mfg_project");
			ResultSetMetaData metaData = rs.getMetaData();
			while (rs.next()) {
				int size = metaData.getColumnCount();
				StringBuffer row = new StringBuffer();
				for (int i = 0; i < size; i++) {
					row.append(rs.getString(i + 1)).append(", ");
				}
				System.out.println(row.toString());
				row.delete(0, row.length());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
