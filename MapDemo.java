import java.util.Map;
import java.util.TreeMap;
class MapDemo{
	public static void main(String args[]){
		Map<String,Integer> values=new TreeMap<>();
		values.put("Second",2);
		values.put("First",1);
		System.out.println("Map using treemap: "+values);
		values.replace("First",11);
		values.replace("Second",22);
		System.out.println("New map: "+values);
		int remvalue=values.remove("First");
		
		System.out.println("Removed value: "+remvalue);
	}
}