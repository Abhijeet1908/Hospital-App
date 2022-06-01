package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Observation;

public interface Observation_Dao {

	Observation createObservation(Observation observation, int encounter_id);

	Observation getObservationById(int observation_id);

	List<Observation> getObservationByEncounterId(int encounter_id);

	Observation updateObservation(Observation observation, int observation_id);

	boolean deleteObservation(int observation_id);
}