import java.util.*;
public class LinkedListDemo{
	public static void main(String args[]){
		LinkedList<String> al=new LinkedList<String>();
		al.add("Rani");
		al.add("Gopi");
		al.add("Ravi");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	//METHODS
		//add()
		LinkedList llist=new LinkedList();
		llist.add("Java");
		llist.add("Python");
			llist.add("Python");
		System.out.println("Linked List : "+ llist);
		Collection collection=new ArrayList();
		collection.add("Android");
		collection.add("Kotlin");
		collection.add("php");
		llist.addAll(collection);
		
		System.out.println("Linked List : "+ llist);
		llist.addAll(collection);

















	}
}