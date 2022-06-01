package hospital_app.controller.user;

import java.nio.file.attribute.UserPrincipalLookupService;

import hospital_app.dto.User;
import hospital_app.service.implementing_class.UserServiceImp;

public class TestUpdateUser {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		User user = new User();
		user.setId(2);
		user.setName("Sangita");
		user.setEmail("san@gmail.com");
		user.setRole("nurse");
		user.setPassword("san123");
		
		imp.updateUser(user, 2);
	}

}
