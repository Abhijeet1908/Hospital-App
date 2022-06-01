package hospital_app.service;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public interface Hospital_Service {
	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int hospital_id);

	List<Branch> getHospitalBranchesById(int hospital_id);

	List<Hospital> getAllHospital();

	Hospital updateHospital(Hospital hospital, int hospital_id);

	boolean deleteHospital(int hospital_id);

}