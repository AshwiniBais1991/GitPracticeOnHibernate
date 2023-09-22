package com.curd;

public class MainClass {
	public static void main(String[] args) {
		CurdOperation curdOperation = new CurdOperation();
		System.out.println("inset/create");
		curdOperation.insertOPeration();
		System.out.println("update");
		curdOperation.updateOperation();
		System.out.println("delete");
		curdOperation.deleteOperation();
		System.out.println("read");
		curdOperation.readDataFromTable();
		
		
	}

}
