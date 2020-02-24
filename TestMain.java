package collection.list;

import java.util.Scanner;

public class TestMain {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 String name;
	 String mailid;
	 String mobileno;
	 double totprice;
	 
	 System.out.println("Enter object 1 details");
	
	 name=sc.next();
	 mailid=sc.next();
	 mobileno=sc.next();
	 totprice=sc.nextDouble();
	 
	 Registration r1=new Registration(name,mailid,mobileno,totprice);
	 
	 System.out.println("Enter object 2 details");
	 name=sc.next();
	 mailid=sc.next();
	 mobileno=sc.next();
	 totprice=sc.nextDouble();
	
	 Registration r2=new Registration(name,mailid,mobileno,totprice);
	 
	 if(r1.equals(r2)){
		 System.out.println("Same object");
	 }
	 else
		 System.out.println("Different object");
	 
	 
}
}
