package hospital_app.controller.person;

import hospital_app.dto.Person;
import hospital_app.service.implementing_class.PersonServiceImp;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonServiceImp imp = new PersonServiceImp();
		Person person = imp.getPersonById(1);
		if(person !=null) {
		System.out.println("Person name is "+ person.getName());
		}
		else
		{
			System.out.println("No person found");
		}
	}

}
