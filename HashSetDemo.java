import java.util.*;
public class HashSetDemo{
	public static void main(String args[]){
		HashSet<String> al=new HashSet<String>();
		al.add("Rani");
		al.add("Gopi");
		al.add("Ravi");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}