package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.User_Dao;
import hospital_app.dto.User;

public class UserDaoImp implements User_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		// This method will save the User details into the database and will return the
		// values of the User after it is saved in the database

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return entityManager.find(User.class, user.getId());
	}

	public User validateUser(String email, String password) {
		// This method will validate the user by email address and password is
		// validation is successful it will return the details of the user
		String sql = "SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2";

		Query query = entityManager.createQuery(sql);

		query.setParameter(1, email);

		query.setParameter(2, password);

		List<User> users = query.getResultList();
		return users.get(0);

	}

	public List<User> getAllUser() {
		//This method will return details of a all the users from the database
		String sql = "SELECT u FROM User u ";

		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

	public User getUserById(int id) {
	
		//This method will give the details of the user from the database 
		//whose id matches with the passed id value
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	public User updateUser(User user, int id) {
		//This method is used to update the existing User details with the passed user details
		//this method will return the details of the updated user
		User ut = getUserById(id);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

		if (ut != null) {

			System.out.println("Modification Sucessful");

		} else {
			System.out.println("No exixting product found so new entry added");
		}

		return user;
	}

	public boolean deleteUserById(int id) {
		//This method is used to delete the user details whose id value is matched
		//with the value passed to it, this method will return true if the user details
		//is successfully deleted
		User user = entityManager.find(User.class, id);

		if (user != null) {
			entityTransaction.begin();

			entityManager.remove(user);

			entityTransaction.commit();

			return true;
		}
		return false;
	}

}
