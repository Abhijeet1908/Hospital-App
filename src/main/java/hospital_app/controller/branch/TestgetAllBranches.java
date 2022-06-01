package hospital_app.controller.branch;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.implementing_class.HospitalServiceImp;

public class TestgetAllBranches {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		
		
		
		List<Branch> branchs= hospitalServiceImp.getHospitalBranchesById(1);
		for(Branch branch: branchs) {
			System.out.println("Bramch name "+branch.getName());
		}
	}

}
