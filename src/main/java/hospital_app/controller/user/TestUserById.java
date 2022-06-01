package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.implementing_class.UserServiceImp;

public class TestUserById {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();

		User user = imp.getUserById(1);
		if (user != null) {
			System.out.println("User name is  " + user.getName());
		} else {
			System.out.println("No user found");
		}

	}
}
