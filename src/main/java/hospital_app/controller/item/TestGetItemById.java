package hospital_app.controller.item;

import hospital_app.dto.Item;
import hospital_app.service.implementing_class.ItemServiceImp;

public class TestGetItemById {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImpl = new ItemServiceImp();
		Item item = itemServiceImpl.getItemById(1);
		if (item != null) {
			System.out.println(item.getName());
		} else {
			System.out.println("No Item");
		}
	}
}