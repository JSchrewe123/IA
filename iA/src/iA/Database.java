package iA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	
	Database(){
		
	}
	static void displayAll() {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			Connection c = DriverManager.getConnection("jdbc:hsqldb:file:hsqldb.test", "SA", "");
			Statement stmt = c.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM users");
			while (res.next()) {
				System.out.println(res.getString(1) + " - "+res.getString(2));
			}
			res.close();
			stmt.close();
			c.close();
		} catch(Exception e) {	
			System.err.println(e);
		}
	}


}
