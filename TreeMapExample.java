package collection.list;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {

		   public static void main(String args[]) {
		      // HashSet declaration
		      TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();

		      // Adding elements to the HashSet
		      tmap.put(1,"Apple");
		      tmap.put(4,"Mango");
		      tmap.put(9,"Grapes");
		      tmap.put(6,"Orange");
		      tmap.put(2,"Fig");
		      //Addition of duplicate elements
		      tmap.put(5,"Apple");
		      tmap.put(3,"Mango");
		      //Addition of null values
		      tmap.put(7,null);
		      tmap.put(8,null);
		    //  tmap.put(null,null);
		     // tmap.put(null, "banana");

		      //Displaying HashSet elements
		      System.out.println(tmap);
		      
		      //for loop
		      for(Map.Entry m:tmap.entrySet()){
		    	  System.out.println("Key :"+m.getKey()+"     Value :"+m.getValue());
		      }
		    }
		}






