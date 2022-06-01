package hospital_app.controller.user;

import hospital_app.service.implementing_class.UserServiceImp;

public class TestDeleteUser {
	public static void main(String[] args) {
		UserServiceImp imp = new UserServiceImp();
		System.out.println(imp.deleteUserById(2));
	}

}
