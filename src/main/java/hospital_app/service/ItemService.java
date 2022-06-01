package hospital_app.service;

import java.util.List;

import hospital_app.dto.Item;

public interface ItemService {

	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int item_id);

	List<Item> getItemByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int item_id);

	boolean deleteItem(int item_id);

}