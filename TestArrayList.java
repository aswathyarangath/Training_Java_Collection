package collection.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("Athul");
		li.add("Rahul");
		li.add("Rita");
		li.add(null);
		li.add(null);
		System.out.println(li);
		ArrayList l1=new ArrayList();
		l1.add("meera");
		l1.add(3);
		l1.add("RAHUL");
		System.out.println(l1);
		li.addAll(l1);
		
		System.out.println(li);
		System.out.println("Index of method  : "+li.indexOf("meera"));
		
		
		l1.remove(0);
		System.out.println(l1);
		
		System.out.println("Converting arraylist to array");
		Object ob[]=li.toArray();
		for(Object o:ob){
			System.out.println(o);
		}
		List l=Arrays.asList(20,"farah",34.5);
		System.out.println(l);
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
		Object ob1=li.get(1);
		System.out.println(ob1);
	}

}
