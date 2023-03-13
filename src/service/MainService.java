package service;

import dataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyLinkedList<String> stringList = new MyLinkedList<>();
			stringList.add("Karina");
			stringList.add("Janis");
			stringList.print();
			stringList.add("Jana", 0);
			stringList.print();
			stringList.add("Karlis", 2);
			stringList.print();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
