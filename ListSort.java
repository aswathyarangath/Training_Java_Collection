package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {
	public static void main(String[] args) {
		ArrayList<Integer> sl=new ArrayList();
		sl.add(10);
		sl.add(7);
		sl.add(2);
		sl.add(43);
		sl.add(1);
		sl.add(3);
		Collections.sort(sl);
		System.out.println(sl);
		
		ArrayList<String> l2=new ArrayList();
		l2.add("orange");
		l2.add("strawerry");
		l2.add("apple");
		l2.add("mango");
		l2.add("banana");
		Collections.sort(l2);
		System.out.println(l2);
		
		
	}

}
