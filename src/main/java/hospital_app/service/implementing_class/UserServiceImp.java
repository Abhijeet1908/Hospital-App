package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.UserDaoImp;
import hospital_app.dto.User;
import hospital_app.service.UserService;

public class UserServiceImp implements UserService {
UserDaoImp daoImp = new UserDaoImp();
	public User saveUser(User user) {
		return daoImp.saveUser(user);
	}

	public User validateUser(String email, String password) {
		return daoImp.validateUser(email, password);
	}

	public List<User> getAllUser() {
		return daoImp.getAllUser();
	}

	public User getUserById(int id) {
		return daoImp.getUserById(id);
	}

	public User updateUser(User user, int id) {
		return daoImp.updateUser(user, id);
	}

	public boolean deleteUserById(int id) {
		return daoImp.deleteUserById(id);
	}

}
