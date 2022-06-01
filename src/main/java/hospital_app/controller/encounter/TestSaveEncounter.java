package hospital_app.controller.encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Encounter;
import hospital_app.service.implementing_class.EncounterServiceImp;


public class TestSaveEncounter {
	public static void main(String[] args) {
		Encounter encounter = new Encounter();
		encounter.setAdmitDateTime(LocalDateTime.now());
		encounter.setReason("dskjha");
		encounter.setDischargeDateTime(LocalDateTime.now());
		
		EncounterServiceImp encounterServiceImpl = new EncounterServiceImp();
		Encounter encounter2 = encounterServiceImpl.saveEncounter(1, 3, encounter);
		if(encounter2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}