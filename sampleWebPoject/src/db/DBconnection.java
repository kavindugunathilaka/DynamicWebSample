/**
 * 
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author kavindu
 *
 */
public class DBconnection {

private String url="jdbc:mysql://localhost/sampleWebPoject";
private String user = "root";
private String password = "kavindu@123K";
private String driver ="com.mysql.jdbc.Driver";
private Connection connection;




public Connection getConnection() throws ClassNotFoundException,SQLException{
	Class.forName(driver);
	connection = DriverManager.getConnection(url,user,password);
	System.out.println("connection to db done!");
	return connection;
	
}
//public static void main(String[] args) {
//	try {
//		new DBconnection().getConnection();
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
	
     
}
