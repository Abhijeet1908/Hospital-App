package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Branch_Dao;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;

public class BranchDaoImp implements Branch_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch, int hospital_id) {
		// This method is used to save the Branch details in the database
		// and this method returns the details of the branch saved in the database

		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			branch.setHospital(hospital);
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getId());
		} else {
			return null;
		}
	}

	public Branch getBranchById(int branch_id) {
		// This method fetches the details of the branch whose branch id value matches
		// with the passed value
		String sql = "SELECT b FROM Branch b WHERE b.id=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, branch_id);
		List<Branch> branchs = query.getResultList();
		return branchs.get(0);

	}

	public Hospital getBranchHospitalById(int branch_id) {
		// This method will return the Hospital under which the branch with the given id
		// falls
		Branch branch = entityManager.find(Branch.class, branch_id);
		return branch.getHospital();

	}

	public List<Branch> getAllBranch() {
		// This method returns details of all the Branches
		String sql = "SELECT b FROM Branch b";
		Query query = entityManager.createQuery(sql);
		List<Branch> branchs = query.getResultList();
		return branchs;
	}

	public List<Branch> getHospitalBranches(int hospital_id) {
		// This method returns all the branches associate with the given hospital id
		String sql = "SELECT b FROM Branch b WHERE b.hospital_id=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, hospital_id);
		List<Branch> branchs = query.getResultList();
		return branchs;
	}

	public List<Encounter> getBranchEncounters(int branch_id) {
		// This method returns all the Encounters associated with the Branch whose id is
		// passed is provided
		Branch branch = entityManager.find(Branch.class, branch_id);

		return branch.getEncounters();

	}

	public Branch updateBranch(Branch branch, int branch_id) {
		// This method will update the existing branch detail and updated branch details
		// is returned
		Branch branch2 = entityManager.find(Branch.class, branch_id);
		if (branch2 != null) {
			entityTransaction.begin();
			entityManager.merge(branch);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getId());
		}
		return null;
	}

	public boolean deleteBranch(int branch_id) {
		// This method will delete the branch details whose id matches with the value
		// passed,
		// if the branch is deleted then it will return true else it will return false

		Branch branch = entityManager.find(Branch.class, branch_id);

		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

}
