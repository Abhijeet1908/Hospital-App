package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Hospital_Dao;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class HospitalDaoImp implements Hospital_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getId());
	}

	public Hospital getHospitalById(int hospital_id) {
	
		return entityManager.find(Hospital.class,hospital_id);
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {
		//This method will give details of the Branches associated with the hospital id provided
	Hospital hospital = entityManager.find(Hospital.class, hospital_id);
	
	if (hospital!= null)
	{
		return hospital.getBranch();
		
	}
	
		return null;
	}

	public List<Hospital> getAllHospital() {
		Query query = entityManager.createQuery("SELECT h FROM Hospital h");
		return query.getResultList();
		
		
		
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {
		Hospital hospital2 = entityManager.find(Hospital.class, hospital_id);
		if(hospital2 != null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			
			return entityManager.find(Hospital.class, hospital.getId());
		}
		return null;
	}

	public boolean deleteHospital(int hospital_id) {
		Hospital hospital  = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			
			return true;
		}
		return false;
	}

}
