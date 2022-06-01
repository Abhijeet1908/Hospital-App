package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public interface MedOrder_Dao {

	MedOrder saveMedOrder(MedOrder medOrder, int encounter_id);

	MedOrder getMedOrderById(int medOrder_id);

	List<MedOrder> getMedOrderByEncounterId(int encounter_id);

	MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id);

	boolean deleteMedOrder(int medOrder_id);
	
	List<Item> getItemsByMedOrderId(int medOrder_id);

}
