package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dao.Encounter_Dao;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class EncounterDaoimp implements Encounter_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		// This method saves the encounter and takes branch id, person id, encounter
		// objects
		// as the arguments and returns saved encounter object
		Branch branch = entityManager.find(Branch.class, branch_id);
		Person person = entityManager.find(Person.class, person_id);
		if (branch != null && person != null) {
			entityTransaction.begin();
			encounter.setBranch(branch);
			encounter.setPerson(person);
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		} else {
			return null;
		}
	}

	public Encounter getEncounterById(int id) {
		// This method fetches the encounter object whose id matches with the value
		// passed
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			return encounter;
		}
		return null;
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {
		// This method returns the all the encounters associated with the branch whose
		// id
		// matches with the values passed

		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			return branch.getEncounters();
		}

		return null;
	}

	public List<Encounter> getEncounterByPersonId(int person_id) {
		// This method returns the all the encounters associated with the person whose
		// id
		// matches with the values passed

		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			return person.getEncounters();
		}

		return null;
	}

	public Encounter updateEncounter(Encounter encounter, int encounter_id) {
		// This method is used to update the encounter previously saved in the database,
		// this method merges the previous data and replaces with the new encounter data
		// at the given id.
		// The return type of this method is the new modified encounter from the
		// database

		entityTransaction.begin();
		entityManager.merge(encounter);
		entityTransaction.commit();

		return entityManager.find(Encounter.class,  encounter_id);

	}

	public boolean deleteEncounter(int encounter_id) {
			// This method will delete the encounter details whose id matches with the value
			// passed,
			// if the encounter is deleted then it will return true else it will return false
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);

		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

}
