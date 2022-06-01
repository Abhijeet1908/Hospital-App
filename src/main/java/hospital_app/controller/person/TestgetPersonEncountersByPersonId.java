package hospital_app.controller.person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class TestgetPersonEncountersByPersonId {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class,1);
		List<Encounter> encounters = person.getEncounters();
		for(Encounter e: encounters) {
			System.out.println("Encounter number is");
		}
	}

}
