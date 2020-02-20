//various navigableset
import java.util.TreeSet;
import java.util.*;
class nav{
	public static void main(String args[]){
		TreeSet<String> set=new TreeSet<String> ();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial set :"+set);
		System.out.println("Reverse set :"+set.descendingSet());
		System.out.println("Head set :"+set.headSet("C",true));
		System.out.println("Sub set :"+set.subSet("A",false,"E",true));
		System.out.println("Tail set :"+set.tailSet("C",false));
	}
}
