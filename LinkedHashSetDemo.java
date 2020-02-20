import java.util.*;
 class LinkedHashSetDemo{
	public static void main(String args[]){
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		al.add("Rani");
		al.add("Gopi");
		al.add("Ravi");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}