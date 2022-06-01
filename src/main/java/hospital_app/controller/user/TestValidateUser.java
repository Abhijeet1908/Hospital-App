package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.implementing_class.UserServiceImp;

public class TestValidateUser {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		User user = imp.validateUser("rushi1234@gmail.com", "rushi123");
		if (user != null) {
			System.out.println(user.getRole());
		} else {
			System.out.println("No user found");
		}
	}

}
