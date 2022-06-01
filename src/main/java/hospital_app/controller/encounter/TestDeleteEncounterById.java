package hospital_app.controller.encounter;

import hospital_app.service.implementing_class.EncounterServiceImp;

public class TestDeleteEncounterById {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImpl = new EncounterServiceImp();
		boolean flag = encounterServiceImpl.deleteEncounter(7);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No Encounter with given id");
		}
	}
}