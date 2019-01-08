package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list =  departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		/*
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Fabiano", "fabiano@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("marthawaine@gmail.com");
		sellerDao.update(seller);
		System.out.println("Updated! New Name: " + seller.getName() + ",  New email: " + seller.getEmail());

		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteByid(id);
		System.out.println("Delete completed");
		*/
		
		sc.close();

	}

}
