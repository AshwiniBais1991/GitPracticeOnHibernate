package com.curd;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CurdOperation {

	SessionObject sessionObject = new SessionObject();

	public void insertOPeration() {
		Session session = sessionObject.getSessionObject();
		Transaction transaction = session.beginTransaction();
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Ashwini","Bangaluru","ashwini@gmail.com"));
		list.add(new Employee("Nidhyana","Bangaluru1","nidhyana@gmail.com"));
		list.add(new Employee("Akshita","Bangaluru2","akshita@gmail.com"));
		list.add(new Employee("Neeraj","Bangaluru3","neeraj@gmail.com"));
		session.save(list);
		session.close();
		transaction.commit();
		
	}

}
