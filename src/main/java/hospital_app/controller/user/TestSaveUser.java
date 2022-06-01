package hospital_app.controller.user;

import hospital_app.dto.User;
import hospital_app.service.implementing_class.UserServiceImp;

public class TestSaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Rushi");
		user.setRole("nurse");
		user.setEmail("rushi1234@gmail.com");
		user.setPassword("rushi123");
		
		UserServiceImp imp = new UserServiceImp();
		imp.saveUser(user);
	}

}
