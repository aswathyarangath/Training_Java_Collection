package collection.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String args[]){
		String s1="hi-hello-there";
		String s2="12-)34567-89";
		getValue(s1,s2);
	}
	public static void getValue(String s1,String s2){
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='-'){
				l1.add(i);
			}
		}
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='-'){
				l2.add(i);
			}
		}
		System.out.println(l1);
		System.out.println(l2);
		if(l1.equals(l2)){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}
	}



