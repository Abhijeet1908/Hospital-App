package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Encounter;

public interface Encounter_Dao {

	Encounter saveEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int id);

	List<Encounter> getEncountersByBranchId(int branch_id);

	List<Encounter> getEncounterByPersonId(int person_id);

	Encounter updateEncounter(Encounter encounter, int encounter_id);

	boolean deleteEncounter(int encounter_id);

}