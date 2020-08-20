package controllers;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import db.DBconnection;
import model.User;

public class UserControllers {
	
	public static int addUser(User user, java.sql.PreparedStatement preparedStatement) {
		
		int result = 0;
		Connection connection = null;
		String sql = "INSERT INTO 'users'('user-name','type','password')VALUES (?,?,PASSWORD(?))";
		
		try {
			connection = new DBconnection().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(3,user.getPassword());
			preparedStatement.setString(1,user.getUsername());
			preparedStatement.setString(2,user.getUsertype());
			result result;
			
		}finally {
			if(preparedStatement != null) {
				 preparedStatement.close();
			}
			if(connection !=null) {
				connection.close();
			}
		}
	}

}
