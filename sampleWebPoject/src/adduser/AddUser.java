package adduser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.UserControllers;
import model.User;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
     
    public AddUser() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String type=request.getParameter("user-type");
		String userpword=request.getParameter("password");
		
		 
		
//		System.out.println("u-name:" + username + "u-type" +  type + "userpword : " + userpword);

		System.out.println("get awa");
		
		User user = new User();
		user.setUsername(username);
		user.setUserid(userid);
		user.setUsertype(usertype);
		
		UserControllers.AddUser(user);
		
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("post awa");
		
	}

}
