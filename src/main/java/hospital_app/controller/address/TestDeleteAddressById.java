package hospital_app.controller.address;

import hospital_app.service.implementing_class.AddressServiceImp;

public class TestDeleteAddressById {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImpl = new AddressServiceImp();
		boolean flag = addressServiceImpl.deleteAddress(3);
		if(flag) {
			System.out.println("deleted");
		}else {
			System.out.println("Address not found");
		}
	}
}