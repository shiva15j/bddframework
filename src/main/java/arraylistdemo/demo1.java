package arraylistdemo;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ritu");
		list.add("isha");
		list.add("shubham");
		list.add("shivam");
		System.out.println(list);
		System.out.println("The size of the list=:"+list.size());
		System.out.println("_____________");
		list.add("ritu");
		list.add("isha");
		list.add("shubham");
		list.add("shivam");
		System.out.println(list);
		System.out.println("The size of the list=:"+list.size());
	}

}
