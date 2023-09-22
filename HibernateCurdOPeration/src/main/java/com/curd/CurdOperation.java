package com.curd;

import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CurdOperation {

	SessionObject sessionObject = new SessionObject();

	public void insertOPeration() {
		SessionFactory sessionFactory = sessionObject.getSessionObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//List<Employee> list = new ArrayList<Employee>();
		Employee employee1 = new Employee();
		employee1.setName("Ashwini");
		employee1.setCity("Bengaluru");
		employee1.setEmailId("ashwini@gmail.com");
		
		Employee employee2 = new Employee();
		employee2.setName("Nidhyana");
		employee2.setCity("Bengaluru2");
		employee2.setEmailId("nidhyana@gmail.com");
		
		Employee employee3 = new Employee();
		employee3.setName("Akshita");
		employee3.setCity("Bengaluru4");
		employee3.setEmailId("akshita@gmail.com");
		
		Employee employee4 = new Employee();
		employee4.setName("Neeraj");
		employee4.setCity("Bengaluru");
		employee4.setEmailId("neeraj@gmail.com");
		
		Employee employee5 = new Employee();
		employee5.setName("Neeraj34");
		employee5.setCity("Bengaluru5");
		employee5.setEmailId("neeraj123@gmail.com");
		
		session.save(employee1);
		//transaction.commit();
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);
		session.save(employee5);
		transaction.commit();
		session.close();
		//sessionFactory.close();
		System.out.println("records inserted successfully");
		
		
		
	}
	public void updateOperation() {
		SessionFactory sessionFactory = sessionObject.getSessionObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter employee id to update record");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("what you want to update name/city/email...Enter your choice");
		String ans = scanner.next();
		Employee emp = session.get(Employee.class, id);
		if(ans.equals("name")) {
			System.out.println("Enter new name of Employee");
			String name = scanner.next();
			emp.setName(name);
			session.save(emp);
		}
		if(ans.equals("city")) {
			System.out.println("Enter new city of Employee");
			String city = scanner.next();
			emp.setName(city);
			session.save(emp);
			
		}
		if(ans.equals("email")) {
			System.out.println("Enter new email of Employee");
			String email = scanner.next();
			emp.setEmailId(email);
			session.save(emp);
		}
		transaction.commit();
		session.close();
		System.out.println("Record is updated for "+id);
	}

	public void deleteOperation() {
		SessionFactory sessionFactory = sessionObject.getSessionObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Enter employee id to delete record");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Employee emp = session.get(Employee.class, id);
		session.delete(emp);
		transaction.commit();
		session.close();
		System.out.println("Record is deleted for "+id);
	}
	
	public void readDataFromTable() {
		SessionFactory sessionFactory = sessionObject.getSessionObject();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println("Employee Data is>>>");
		for(Employee emp : list) {
			System.out.println("Id >>> "+emp.getEmployeeId());
			System.out.println("Name >>>> "+emp.getName());
			System.out.println("city >>> "+emp.getCity());
			System.out.println("mailId >>> "+emp.getEmailId());
		}
		//transaction.commit();
		session.close();
		
		
	}
}
