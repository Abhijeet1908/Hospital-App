package hospital_app.controller.MedOrder;

import hospital_app.dto.MedOrder;
import hospital_app.service.implementing_class.MedOderServiceImp;

public class TestUpdateMedOrder {
	public static void main(String[] args) {
		MedOrder medOrder = new MedOrder();
		medOrder.setTotalCost(300);

		MedOderServiceImp medOrderServiceImpl = new MedOderServiceImp();
		MedOrder medOrder2 = medOrderServiceImpl.updateMedOrder(medOrder, 2);
		if (medOrder2 != null) {
			System.out.println("Saved");
		} else {
			System.out.println("Not saved");
		}
	}
}