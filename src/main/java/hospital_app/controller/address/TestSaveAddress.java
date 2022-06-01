package hospital_app.controller.address;


import hospital_app.dto.Address;
import hospital_app.service.implementing_class.AddressServiceImp;

public class TestSaveAddress {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Marathahalli");
		address.setState("Karnataka");
		address.setCountry("India");
		
		AddressServiceImp addressServiceImpl = new AddressServiceImp();
		Address address2=addressServiceImpl.saveAddress(address, 3);
		if(address2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not Saved");
		}
	}
}
