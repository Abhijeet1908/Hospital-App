package hospital_app.controller.encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Encounter;
import hospital_app.service.implementing_class.EncounterServiceImp;


public class TestUpdateEncounterById {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImpl = new EncounterServiceImp();
		Encounter encounter = new Encounter();
		encounter.setAdmitDateTime(LocalDateTime.now());
		encounter.setReason("cancer");
		encounter.setDischargeDateTime(LocalDateTime.now());
		Encounter encounter1 = encounterServiceImpl.updateEncounter(encounter, 10);
		if(encounter1!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("No encounter with given id");
		}
	}
}