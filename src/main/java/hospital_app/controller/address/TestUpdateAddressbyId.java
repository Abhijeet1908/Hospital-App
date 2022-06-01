package hospital_app.controller.address;

import hospital_app.dto.Address;
import hospital_app.service.implementing_class.AddressServiceImp;

public class TestUpdateAddressbyId {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		AddressServiceImp addressServiceImp = new AddressServiceImp();
		Address address2 = addressServiceImp.updateAddress(address, 4);
		if(address2!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("no address found");
		}
	}
}