package hospital_app.controller.hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.implementing_class.HospitalServiceImp;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Rita Health Sanchuary");
		hospital.setWebsite("www.RitaHealthSanchuary.com");
		
		HospitalServiceImp hospitalService = new HospitalServiceImp();
		hospitalService.saveHospital(hospital);
		
	}

}
