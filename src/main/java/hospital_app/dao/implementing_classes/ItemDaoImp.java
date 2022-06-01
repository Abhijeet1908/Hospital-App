package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dao.Item_Dao;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class ItemDaoImp implements Item_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(Item item, int medOrder_id) {
		// This method is used to save the item details in the database
		// and this method returns the details of the item saved in the database

		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			entityTransaction.begin();
			item.setMedOrder(medOrder);
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		} else {
			return null;
		}
	}

	public Item getItemById(int item_id) {
		// This method fetches the details of the item whose branch id value matches
		// with the passed value

		Item item = entityManager.find(Item.class, item_id);
		if(item != null) {
		return item;
		}
		return null;
	}

	public List<Item> getItemByMedOrderId(int medOrder_id) {
		// This method will return the medOrder under which the item with the given id
		// falls

		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);

		return medOrder.getItems();

	}

	public Item updateItem(Item item, int item_id) {
		// This method will update the existing Item detail and updated Item details
		// is returned
		Item item1 = entityManager.find(Item.class, item_id);
		if (item1 != null) {
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			return entityManager.find(Item.class, item_id);
		}
		return null;
	}

	public boolean deleteItem(int item_id) {
		// This method will delete the item details whose id matches with the value
		// passed,
		// if the item is deleted then it will return true else it will return false

		Item item = entityManager.find(Item.class, item_id);

		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

}
