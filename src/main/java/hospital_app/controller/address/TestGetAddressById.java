package hospital_app.controller.address;

import hospital_app.dto.Branch;
import hospital_app.service.implementing_class.AddressServiceImp;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImpl = new AddressServiceImp();
		Branch branch = addressServiceImpl.getBranchByAddressId(1);
		if(branch!=null) {
			System.out.println("Branch Name : "+branch.getName());
		}
		else {
			System.out.println("no address with given id");
		}
	}
}