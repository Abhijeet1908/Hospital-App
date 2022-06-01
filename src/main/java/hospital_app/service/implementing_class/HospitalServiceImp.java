package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.HospitalDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.Hospital_Service;

public class HospitalServiceImp implements Hospital_Service{
	HospitalDaoImp dao = new HospitalDaoImp();
	public Hospital saveHospital(Hospital hospital) {
		return dao.saveHospital(hospital);
	}

	public Hospital getHospitalById(int hospital_id) {
		
		return dao.getHospitalById(hospital_id);
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {
		
		return dao.getHospitalBranchesById(hospital_id);
	}

	public List<Hospital> getAllHospital() {


		return dao.getAllHospital();
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {
		
		return dao.updateHospital(hospital, hospital_id);
	}

	public boolean deleteHospital(int hospital_id) {
		return dao.deleteHospital(hospital_id);
	}

}
