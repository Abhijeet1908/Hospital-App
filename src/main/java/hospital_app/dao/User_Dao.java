package hospital_app.dao;

import java.util.List;

import hospital_app.dto.User;

public interface User_Dao {
	User saveUser(User user);

	User validateUser(String email, String password);

	List<User> getAllUser();

	User getUserById(int id);

	User updateUser(User user, int id);

	boolean deleteUserById(int id);

}
