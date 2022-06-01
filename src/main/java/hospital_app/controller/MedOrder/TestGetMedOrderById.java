package hospital_app.controller.MedOrder;

import hospital_app.dto.Encounter;
import hospital_app.dto.MedOrder;
import hospital_app.service.implementing_class.MedOderServiceImp;

public class TestGetMedOrderById {
	public static void main(String[] args) {
		MedOderServiceImp medOrderServiceImpl = new MedOderServiceImp();
		MedOrder medOrder = medOrderServiceImpl.getMedOrderById(1);
		if (medOrder != null) {
			System.out.println(medOrder.getTotalCost());
			Encounter encounter = medOrder.getEncounter();
			System.out.println(encounter.getReason());
		} else {
			System.out.println("Not Found");
		}
	}
}