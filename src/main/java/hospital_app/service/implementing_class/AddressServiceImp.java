package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.AddressDaoImp;
import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.service.AddressService;

public class AddressServiceImp implements AddressService {
AddressDaoImp addressDaoImp = new AddressDaoImp();
	public Address saveAddress(Address address, int branch_id) {
		return addressDaoImp.saveAddress(address, branch_id);
	}

	public Branch getBranchByAddressId(int id) {
		return addressDaoImp.getBranchByAddressId(id);
	}

	public List<Branch> getBranchByCity(String city) {
		return addressDaoImp.getBranchByCity(city);
	}

	public Address updateAddress(Address address, int address_id) {
		
		return addressDaoImp.updateAddress(address, address_id);
	}

	public boolean deleteAddress(int address_id) {
		return addressDaoImp.deleteAddress(address_id);
	}

}
