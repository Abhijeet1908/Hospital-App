package hospital_app.controller.person;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.service.implementing_class.PersonServiceImp;

public class TestSavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "SELECT e From Encounter e";
		Query query = entityManager.createQuery(sql);
		List<Encounter> list = query.getResultList();
		
		Person person = new Person();
		person.setName("Rajesh");
		person.setAge(45);
		person.setGender("male");
		person.setPhone(456123);
		person.setDob(LocalDate.now());
		person.setEmail("rak@gamil.com");
		person.setEncounters(list);
		PersonServiceImp imp = new PersonServiceImp();
		Person person1 = imp.savePerson(person);
		if( person1 != null) {
			System.out.println("Saved");
		}
		else {
			System.out.println("Not saved");
		}
		
	}
//	Person savePerson(Person person);
//
//	Person getPersonById(int person_id);
//
//	List<Encounter> getPersonEncountersByPersonId(int person_id);
//
//	List<Person> getAllPerson();
//
//	Person updatePerson(Person person, int person_id);
//
//	boolean deletePerson(int person_id);


}
