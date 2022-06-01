package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.PersonDaoImp;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class PersonServiceImp implements PersonService{
PersonDaoImp daoImp = new PersonDaoImp();
	public Person savePerson(Person person) {
		return daoImp.savePerson(person);
	}

	public Person getPersonById(int person_id) {
		return daoImp.getPersonById(person_id);
	}

	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		return daoImp.getPersonEncountersByPersonId(person_id);
	}

	public List<Person> getAllPerson() {
		return daoImp.getAllPerson();
	}

	public Person updatePerson(Person person, int person_id) {
		return daoImp.updatePerson(person, person_id);
	}

	public boolean deletePerson(int person_id) {
		return daoImp.deletePerson(person_id);
	}

}
