package hospital_app.service.implementing_class;

import java.util.List;

import hospital_app.dao.implementing_classes.ItemDaoImp;
import hospital_app.dto.Item;
import hospital_app.service.ItemService;

public class ItemServiceImp implements ItemService{
ItemDaoImp daoImp = new ItemDaoImp();

	public Item saveItem(Item item, int medOrder_id) {
		return daoImp.saveItem(item, medOrder_id);
	}

	public Item getItemById(int item_id) {
		return daoImp.getItemById(item_id);
	}

	public List<Item> getItemByMedOrderId(int medOrder_id) {
		return daoImp.getItemByMedOrderId(medOrder_id);
	}

	public Item updateItem(Item item, int item_id) {
		return daoImp.updateItem(item, item_id);
	}

	public boolean deleteItem(int item_id) {
		return daoImp.deleteItem(item_id);
	}

}
