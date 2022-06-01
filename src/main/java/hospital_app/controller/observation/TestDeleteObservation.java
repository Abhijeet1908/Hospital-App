package hospital_app.controller.observation;

import hospital_app.service.implementing_class.ObservationServiceImp;

public class TestDeleteObservation {
	public static void main(String[] args) {
		ObservationServiceImp observationServiceImpl = new ObservationServiceImp();
		boolean flag = observationServiceImpl.deleteObservation(3);
		if (flag) {
			System.out.println("Deleted");
		} else {
			System.out.println("No Observation found");
		}
	}
}