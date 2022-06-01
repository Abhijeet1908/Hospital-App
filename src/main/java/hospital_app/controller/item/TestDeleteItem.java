package hospital_app.controller.item;

import hospital_app.service.implementing_class.ItemServiceImp;

public class TestDeleteItem {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImpl = new ItemServiceImp();
		boolean flag = itemServiceImpl.deleteItem(4);
		if (flag) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
	}
}