package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		UserMainCode1 um=new UserMainCode1();
		String s1=um.formNewWord(s,n);
		System.out.println("New String:"+s1);

	}


}
class UserMainCode1{
	static String formNewWord(String s,int n){
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++){
			al.add(s.charAt(i));
		}
		for(int i=n;i>0;i--){
			al.add(s.charAt((s.length())-i));
		}
		String s1=al.toString();
		return s1;
		
	}
	
}

