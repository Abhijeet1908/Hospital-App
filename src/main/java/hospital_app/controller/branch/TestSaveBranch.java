package hospital_app.controller.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_app.dao.implementing_classes.BranchDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.BranchService;
import hospital_app.service.implementing_class.BranchServiceImp;

public class TestSaveBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Hospital hospital=entityManager.find(Hospital.class, 1);
		Branch branch = new Branch();
		branch.setName("Marathalli");
		branch.setPhone(785525555);
		branch.setWebsite("www.health.com");
		branch.setEmail("helth.marathalli@ritahealthcare.com");
		
		branch.setHospital(hospital);
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch1 = branchServiceImp.saveBranch(branch, hospital.getId());
		
		if (branch1!=null) {
			System.out.println("Saved sucessfully");
			
		}
		else {
			System.out.println("Branch not saved");
		}
	}

}
