package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Person_Dao;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class PersonDaoImp implements Person_Dao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return entityManager.find(Person.class, person.getId());
	}

	public Person getPersonById(int person_id) {
		// This method will return the person under which the branch with the given id
				// falls
		Person person = entityManager.find(Person.class,person_id);
		return person;

	}

	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		// This method returns all the Encounters associated with the Person whose id is
				// passed or provided
		Person person = entityManager.find(Person.class, person_id);

				return person.getEncounters();
	}


	public List<Person> getAllPerson() {
		String sql = "SELECT p FROM Person p";
		Query query = entityManager.createQuery(sql);
		List<Person> lists = query.getResultList();
		return lists;
		
	}

	public Person updatePerson(Person person, int person_id) {
		// This method will update the existing person detail and updated person details
				// is returned
		Person person1 = entityManager.find(Person.class, person_id);
				if (person1!= null) {
					entityTransaction.begin();
					entityManager.merge(person);
					entityTransaction.commit();
					return entityManager.find(Person.class, person_id);
				}
				return null;
	}

	public boolean deletePerson(int person_id) {
		// This method will delete the Person's details whose id matches with the value
				// passed,
				// if the branch is deleted then it will return true else it will return false

		Person person = entityManager.find(Person.class, person_id);

				if (person != null) {
					entityTransaction.begin();
					entityManager.remove(person);
					entityTransaction.commit();
					return true;
				}

				return false;
			}
	

}
