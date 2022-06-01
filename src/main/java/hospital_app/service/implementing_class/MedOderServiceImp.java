package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.MedOrderDaoImp;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class MedOderServiceImp implements MedOrderService{
	MedOrderDaoImp daoImp = new MedOrderDaoImp();

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		return daoImp.saveMedOrder(medOrder, encounter_id);
	}

	public MedOrder getMedOrderById(int medOrder_id) {
		return daoImp.getMedOrderById(medOrder_id);
	}

	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {
		return daoImp.getMedOrderByEncounterId(encounter_id);
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {
		return daoImp.updateMedOrder(medOrder, medOrder_id);
	}

	public boolean deleteMedOrder(int medOrder_id) {
		return daoImp.deleteMedOrder(medOrder_id);
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {
		return daoImp.getItemsByMedOrderId(medOrder_id);
	}
	

}
