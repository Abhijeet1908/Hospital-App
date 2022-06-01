package hospital_app.controller.MedOrder;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;
import hospital_app.service.implementing_class.MedOderServiceImp;

public class TestSaveMedOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MedOderServiceImp medOderServiceImp = new MedOderServiceImp();
		List<Item> items = new ArrayList<Item>();
		items.add(entityManager.find(Item.class, 1));
		items.add(entityManager.find(Item.class, 2));
		items.add(entityManager.find(Item.class, 3));
		MedOrder medOrder = new MedOrder();
		medOrder.setItems(items);
		double total = 0;
		for (Item item : items) {
			total += item.getCost() * item.getQuantity();
		}
		medOrder.setTotalCost(500);
		MedOrder medOrder2 = medOderServiceImp.saveMedOrder(medOrder, 8);
		if (medOrder2 != null) {
			System.out.println("Saved");
		} else {
			System.out.println("Not saved");
		}

	}
}