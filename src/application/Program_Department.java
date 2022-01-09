package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program_Department {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: insert department ====");
		Department dep = new Department(null, "Delive");
		//departmentDao.insert(dep);
		System.out.println("Inserted! New id: " + dep.getId());
		
		System.out.println("\n==== TEST 2: update department ====");
		dep.setName("T.I");
		dep.setId(3);
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n==== TEST 3: delete department ====");
		departmentDao.deleteById(7);
		System.out.println("Delete completed");
	
		System.out.println("\n==== TEST 4: findAll department ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 5: findById department ====");
		dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 6: seller delet by name ====");
		departmentDao.deleteByName("Delive");
		System.out.println("Delete completed");
		

		scan.close();
	}

}
