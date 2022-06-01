package hospital_app.dao.implementing_classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dao.MedOrder_Dao;
import hospital_app.dto.Encounter;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class MedOrderDaoImp implements MedOrder_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		// This method is used to save the MedOrder details in the database
		// and this method returns the details of the branch saved in the database

		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			medOrder.setEncounter(encounter);
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder.getId());
		} else {
			return null;
		}
	}

	public MedOrder getMedOrderById(int medOrder_id) {
		// This method fetches the details of the medOrder whose medOrder id value
		// matches
		// with the passed value

		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			return medOrder;
		}
		return null;
	}

	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {
		// This method returns medOrder associate with Encounter id.

		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			return encounter.getMedOrders();
		}
		return null;
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {
		// This method will update the existing medOrder detail and updated medOrder
		// details
		// is returned
		MedOrder medOrder1 = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder1 != null) {
			entityTransaction.begin();
			entityManager.merge(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder_id);
		}
		return null;
	}

	public boolean deleteMedOrder(int medOrder_id) {
		// This method will delete the medOder details whose id matches with the value
		// passed,
		// if the item is deleted then it will return true else it will return false

		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);

		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {
		// This method returns items associated with the the given medOrder id
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			return medOrder.getItems();

		}
		return null;
	}

}
