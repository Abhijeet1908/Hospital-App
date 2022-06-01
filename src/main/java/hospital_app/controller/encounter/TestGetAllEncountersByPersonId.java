package hospital_app.controller.encounter;

import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.service.implementing_class.EncounterServiceImp;

public class TestGetAllEncountersByPersonId {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImpl = new EncounterServiceImp();
		List<Encounter> encounters = encounterServiceImpl.getEncounterByPersonId(1);
		for (Encounter encounter : encounters) {
			System.out.println("Encounter Reason : "+encounter.getReason());
		}
	}
}