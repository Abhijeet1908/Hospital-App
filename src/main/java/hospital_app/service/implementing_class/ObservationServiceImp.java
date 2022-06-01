package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.ObservationDaoImp;
import hospital_app.dto.Observation;
import hospital_app.service.ObservationSerivice;

public class ObservationServiceImp implements ObservationSerivice {
ObservationDaoImp daoImp = new ObservationDaoImp();
	public Observation createObservation(Observation observation, int encounter_id) {
		return daoImp.createObservation(observation, encounter_id);
	}

	public Observation getObservationById(int observation_id) {
		return daoImp.getObservationById(observation_id);
	}

	public List<Observation> getObservationByEncounterId(int encounter_id) {
		return daoImp.getObservationByEncounterId(encounter_id);
	}

	public Observation updateObservation(Observation observation, int observation_id) {
		return daoImp.updateObservation(observation, observation_id);
	}

	public boolean deleteObservation(int observation_id) {
		return daoImp.deleteObservation(observation_id);
	}
	

}
