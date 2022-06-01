package hospital_app.controller.hospital;

import hospital_app.service.implementing_class.HospitalServiceImp;

public class TestDeleteHospital {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		System.out.println(hospitalServiceImp.deleteHospital(2));;
	}

}
