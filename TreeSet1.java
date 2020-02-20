import java.util.*;
public class TreeSet1{
	public static void main(String args[]){
		TreeSet<String> al=new TreeSet<String>();
		al.add("Rani");
		al.add("Gopi");
		al.add("Ravi");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}