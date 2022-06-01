package hospital_app.controller.MedOrder;

import hospital_app.service.implementing_class.MedOderServiceImp;

public class TestDeleteMedOrder {
	public static void main(String[] args) {
		MedOderServiceImp medOrderServiceImpl = new MedOderServiceImp();
		boolean flag = medOrderServiceImpl.deleteMedOrder(2);
		if (flag) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not found");
		}
	}
}