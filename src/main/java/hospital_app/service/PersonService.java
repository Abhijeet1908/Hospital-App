package hospital_app.service;

import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public interface PersonService {

	Person savePerson(Person person);

	Person getPersonById(int person_id);

	List<Encounter> getPersonEncountersByPersonId(int person_id);

	List<Person> getAllPerson();

	Person updatePerson(Person person, int person_id);

	boolean deletePerson(int person_id);

}