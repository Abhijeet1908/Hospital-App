package hospital_app.controller.observation;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.implementing_class.ObservationServiceImp;

public class TestSaveObservation {
	 public static void main(String[] args) {
		Observation observation = new Observation();
		observation.setObservationTime(LocalDateTime.now());
		observation.setWriterName("Dr. Smrita");
		
		ObservationServiceImp observationServiceImpl = new ObservationServiceImp();
		Observation observation2 = observationServiceImpl.createObservation(observation, 10);
		if(observation2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}