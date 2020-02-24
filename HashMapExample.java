package collection.list;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


	
	   public static void main(String args[]) {
	      // HashSet declaration
	      HashMap<Integer,String> hmap = new HashMap<Integer,String>();

	      // Adding elements to the HashSet
	      hmap.put(1,"Apple");
	      hmap.put(4,"Mango");
	      hmap.put(9,"Grapes");
	      hmap.put(6,"Orange");
	      hmap.put(2,"Fig");
	      //Addition of duplicate elements
	      hmap.put(5,"Apple");
	      hmap.put(3,"Mango");
	      //Addition of null values
	      hmap.put(7,null);
	      hmap.put(8,null);
	      hmap.put(null,null);
	      hmap.put(null, "banana");

	      //Displaying HashSet elements
	      System.out.println(hmap);
	      
	      //for loop
	      for(Map.Entry m:hmap.entrySet()){
	    	//  hmap.put(12, "strawberry");
	    	  System.out.println("Key :"+m.getKey()+"     Value :"+m.getValue());
	      }
	    }
	}



