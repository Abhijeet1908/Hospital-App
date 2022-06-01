
package hospital_app.controller.hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.implementing_class.HospitalServiceImp;

public class TestUpdateHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setId(1);
		hospital.setName("Rita HealthCare Sanchuary");
		hospital.setWebsite("www.RitaHealthCare.com");
		
		HospitalServiceImp hospitalService = new HospitalServiceImp();
		
		hospitalService.updateHospital(hospital, 1);
	}

}
