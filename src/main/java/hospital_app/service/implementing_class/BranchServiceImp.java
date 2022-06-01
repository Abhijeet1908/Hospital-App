package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.BranchDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.service.BranchService;

public class BranchServiceImp implements BranchService{
BranchDaoImp daoImp = new BranchDaoImp();
	public Branch saveBranch(Branch branch, int hospital_id) {
		return daoImp.saveBranch(branch, hospital_id);
	}

	public Branch getBranchById(int branch_id) {
		return daoImp.getBranchById(branch_id);
	}

	public Hospital getBranchHospitalById(int branch_id) {
		return daoImp.getBranchHospitalById(branch_id);
	}

	public List<Branch> getAllBranch() {
		return daoImp.getAllBranch();
	}

	public List<Branch> getHospitalBranches(int hospital_id) {
		return daoImp.getHospitalBranches(hospital_id);
	}

	public List<Encounter> getBranchEncounters(int branch_id) {
		return daoImp.getBranchEncounters(branch_id);
	}

	public Branch updateBranch(Branch branch, int branch_id) {
		return daoImp.updateBranch(branch, branch_id);
	}

	public boolean deleteBranch(int branch_id) {
		return daoImp.deleteBranch(branch_id);
	}

}
