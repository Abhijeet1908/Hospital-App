package hospital_app.controller.branch;

import hospital_app.service.implementing_class.BranchServiceImp;

public class TestDeleteBranch {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		boolean flag = branchServiceImp.deleteBranch(2);
		if(flag == true) {
			System.out.println("Branch deleted sucessfully");
		}
		else {
			System.out.println("No branch found");
		}
	}

}
