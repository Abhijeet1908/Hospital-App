package hospital_app.controller.item;

import hospital_app.dto.Item;
import hospital_app.service.implementing_class.ItemServiceImp;

public class TestSaveItem {
	public static void main(String[] args) {
		ItemServiceImp implItemServiceImpl = new ItemServiceImp();
		Item item = new Item();
		item.setName("digine");
		item.setQuantity(1);
		item.setCost(5);
		item.setMedOrder(null);
		
		if(implItemServiceImpl.saveItem(item, 1)!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
			
	}
}