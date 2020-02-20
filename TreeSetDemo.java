import java.util.*;
public class TreeSetDemo{
	public static void main(String args[]){
		TreeSet<String> al=new TreeSet<String>();
		al.add("rani");
		al.add("Gopi");
		al.add("Ravi");
		System.out.println("Traversing element gthrough iterator in descending order");
		Iterator<String> itr=al.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}