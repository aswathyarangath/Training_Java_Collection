import java.util.*;
class ArrayListDemo{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("Rani");
		list.add("Gopi");
		list.add("Ram");
		//Traversing list through iterator
		//Iterator itr=list.iterator();
		//while(itr.hasNext()){
			//System.out.println(itr.next());
		//}


			//METHODS

		//add()
		ArrayList<Integer> aList=new ArrayList<Integer>(7);
		aList.add(1);
		aList.add(2);
		aList.add(25);
		Iterator itr=aList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//addAll()
		ArrayList<Integer> aList1=new ArrayList<Integer>(5);
		aList1.add(2);
		aList1.add(6);
		aList1.add(9);
		System.out.println("Printing all elements of aList1= "+aList1);
		ArrayList<Integer> aList2=new ArrayList<Integer>(5);
		aList2.add(12);
		aList2.add(17);
		aList2.add(14);
		aList2.add(13);
		System.out.println("Printing all elements of aList2= "+aList2);
		aList1.addAll(aList2);
		
		aList1.addAll(2,aList2);
		System.out.println("Printing all elements of aList1 after using addAll method =  "+aList1);

		//clear()
		aList.clear();
		

		//clone
		System.out.println(aList1.clone());

		//contains
		ArrayList<Integer> aList3=new ArrayList<Integer>(5);
		aList3.add(4);
		aList3.add(6);
		aList3.add(8);
		//checking contains method
		boolean flag1=aList3.contains(6);
		if(flag1==true){
			System.out.println("aList contains element 2");
		}
		else{
			System.out.println("aList doesnot contains element 2");
		}


		boolean flag2=aList3.contains(5);
		if(flag2==true){
			System.out.println("aList contains element 5");
		}
		else{
			System.out.println("aList doesnot contains element 5");
		}
		


		//get(int index)
		System.out.println(aList1.get(2));

		//indexOf()


		ArrayList<String> aList4=new ArrayList<String>(5);
		aList4.add("Learning");
		aList4.add("Java");
		aList4.add("Python");
		aList4.add("Java");
		System.out.println("Array List String ="+aList4);
		int value1=aList4.indexOf("Java");
		System.out.println("Index retrieved of java = "+value1);
		//AT is not presenet hence prints -1
		int value2=aList4.indexOf("AT");
		System.out.println("Index retrieved of AT= "+value2);
		int value3=aList4.indexOf("Python");
		System.out.println("Index retrieved ofpython = "+value3);
		
		//lastIndexOf()
		System.out.println(aList4.lastIndexOf("java"));

		//remove(int index)
		System.out.println(aList4.remove(2));

		// removeRange(int first,int last)
		aList4.removeRange(1,3);



















































	}
}