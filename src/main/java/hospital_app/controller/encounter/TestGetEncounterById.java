package hospital_app.controller.encounter;

import hospital_app.dto.Encounter;
import hospital_app.service.implementing_class.EncounterServiceImp;

public class TestGetEncounterById {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImpl = new EncounterServiceImp();
		Encounter encounter = encounterServiceImpl.getEncounterById(2);
		if(encounter!=null){
			System.out.println("Encounter Reason : "+encounter.getReason());
		}
		else {
			System.out.println("No encounter with given id");
		}
	}
}