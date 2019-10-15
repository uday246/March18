package Mar27th;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
 * Please place the required jar file in the classpath
 * please change the url connection like hostname and port and user id and password
 */
public class DataBase {
	public ArrayList<String> query(String query) {
		ArrayList<String> list = new ArrayList<String>();
		// Change Accordingly
		Connection dbConnection = null;

		try {
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "uesrid", "password");
		} catch (Exception e) {
			System.out.println("Problem in Creating Connection ");
			return null;
		}
		Statement statement = null;
		try {
			// creating statment
			statement = dbConnection.createStatement();
		} catch (Exception e) {
			System.out.println("Problem in Creating Statment");
			return null;
		}

		ResultSet rs = null;
		try {
			// executing the query which will return the results
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("Problem in execuitng query");
			return null;
		}
		try {
			while (rs.next()) {
				// assuming we want fetch the first column so we are passing the 1
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
		}
		return list;
	}
	public boolean executeDML(String dml) {
		// Change Accordingly
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
		} catch (Exception e) {
			System.out.println("Problem in Creating Connection ");
			return false;
		}
		Statement statement = null;
		try {
			statement = dbConnection.createStatement();
		} catch (Exception e) {
			System.out.println("Problem in Creating Statment");
			return false;
		}
		int res=0;
		try {
			// if is success than it will return the number of rows got updated/inserted/deleted
			res = statement.executeUpdate(dml);
		} catch (SQLException e) {
			System.out.println("Problem in execuiting query");
			return false;
		}
		return res!=0;
		
	}
}

