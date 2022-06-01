package hospital_app.controller.hospital;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.service.implementing_class.HospitalServiceImp;

public class TestGetAllHospital {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		List<Hospital> hospitals = hospitalServiceImp.getAllHospital();
		for(Hospital h: hospitals) {
		System.out.println("Hospital name is "+h.getName());
		}
	}

}
