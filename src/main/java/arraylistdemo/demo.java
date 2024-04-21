package arraylistdemo;

import java.util.ArrayList;

public class demo {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		System.out.println(list);
		System.out.println("The size of the list=:"+list.size());
		System.out.println("_____________");
		list.add(47);
		list.add(81);
		list.add(29);
		list.add(120);
		list.add(121);
		System.out.println(list);
		System.out.println("The size of the list=:"+list.size());
		System.out.println("_____________");

		for(Integer vl:list) {
			System.out.println(vl);
		}
	
	}

}
