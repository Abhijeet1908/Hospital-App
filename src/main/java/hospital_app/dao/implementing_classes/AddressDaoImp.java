  package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Address_Dao;
import hospital_app.dto.Address;
import hospital_app.dto.Branch;

public class AddressDaoImp implements Address_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Address saveAddress(Address address, int branch_id) {
		// This method is used to save the address details in the database
		// and this method returns the details of the address saved in the database

		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			address.setBranch(branch);
			entityManager.persist(address);
			entityTransaction.commit();
			return entityManager.find(Address.class, address.getId());
		} else {
			return null;
		}
	}

	public Branch getBranchByAddressId(int id) {
		// This method fetches the branch details from the address id
		Address address = entityManager.find(Address.class, id);
		if (address != null) {
			return address.getBranch();
		}
		return null;
	}

	public List<Branch> getBranchByCity(String city) {
		// This method returns the branches in the given city
		String sql = "SELECT b FROM Branch b WHERE b.city=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, city);
		List<Branch> branchs = query.getResultList();
		return branchs;
	}

	public Address updateAddress(Address address, int address_id) {
		// This method is used to update the address previously saved in the database,
		// this method merges the previous data and replaces with the new address data
		// at the given id.
		// The return type of this method is the new modified address from the database
		entityTransaction.begin();
		entityManager.merge(address);
		entityTransaction.commit();

		return entityManager.find(Address.class, address_id);

	}

	public boolean deleteAddress(int address_id) {
		// This method will delete the address details whose id matches with the value
		// passed,
		// if the address is deleted then it will return true else it will return false

		Address address = entityManager.find(Address.class, address_id);

		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

}
