package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Observation_Dao;
import hospital_app.dto.Encounter;
import hospital_app.dto.Observation;

public class ObservationDaoImp  implements Observation_Dao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	

	public Observation createObservation(Observation observation, int encounter_id) {
		
		// This method is used to save the observation details in the database
		// and this method returns the observation of the branch saved in the database

	
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			observation.setEncounter(encounter);
			entityManager.persist(observation);
			entityTransaction.commit();
			return entityManager.find(Observation.class, observation.getId());
		} else {
			return null;
		}
	}

	public Observation getObservationById(int Observation_id) {
		// This method fetches the details of the Observation whose branch id value matches
				// with the passed value
				
		Observation observation = entityManager.find(Observation.class, Observation_id);
		if (observation!= null) {
			return observation;
		}
		return null;
	}

	public List<Observation> getObservationByEncounterId(int encounter_id) {
		// This method returns details of all the observation associated with the encounter
		String sql = "SELECT o FROM Observation o";
		Query query = entityManager.createQuery(sql);
		List<Observation> observation = query.getResultList();
		return observation;
	}

	public Observation updateObservation(Observation observation, int observation_id) {
		// This method will update the existing observation detail and updated observation details
				// is returned
		
		entityTransaction.begin();
		entityManager.merge(observation);
		entityTransaction.commit();

		return entityManager.find(Observation.class,  observation_id);
	}

	public boolean deleteObservation(int observation_id) {
		// This method will delete the observation details whose id matches with the value
				// passed,
				// if the observation is deleted then it will return true else it will return false

		Observation observation = entityManager.find(Observation.class, observation_id);

		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}

		return false;
	}
	

}
