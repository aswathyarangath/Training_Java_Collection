import java.util.TreeSet;
import java.util.*;
class Demo{
	public static void main(String args[]){
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(32);
		set.add(12);
		set.add(120);
		set.add(78);
		set.add(8);
		System.out.println("Lowest"+set.pollFirst());
		System.out.println("Greatest "+set.pollLast());
	}
}