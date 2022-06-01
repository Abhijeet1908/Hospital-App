package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.implementing_class.UserServiceImp;

public class TestGetUserById {
	public static void main(String[] args) {
		UserServiceImp imp = new  UserServiceImp();
		User user =imp.getUserById(2);
		
		System.out.println("User name is "+user.getName());
		System.out.println("User role is "+user.getRole());
	}

}
