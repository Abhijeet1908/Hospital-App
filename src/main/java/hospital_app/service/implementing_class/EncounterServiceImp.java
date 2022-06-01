package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.EncounterDaoimp;
import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class EncounterServiceImp implements EncounterService {
EncounterDaoimp daoImp = new EncounterDaoimp();

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		return daoImp.saveEncounter(branch_id, person_id, encounter);
	}

	public Encounter getEncounterById(int id) {
		return daoImp.getEncounterById(id);
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {
		return daoImp.getEncountersByBranchId(branch_id);
	}

	public List<Encounter> getEncounterByPersonId(int person_id) {
		return daoImp.getEncounterByPersonId(person_id);
	}

	public Encounter updateEncounter(Encounter encounter, int encounter_id) {
		return daoImp.updateEncounter(encounter, encounter_id);
	}

	public boolean deleteEncounter(int encounter_id) {
		return daoImp.deleteEncounter(encounter_id);
	}

}
