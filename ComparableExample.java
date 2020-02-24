package collection.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable{
	
	String studentname;
	int rollno;
	int age;
	Student(String studentname,int rollno,int age){
		this.studentname=studentname;
		this.rollno=rollno;
		this.age=age;
	}
	String getStudentname(){
		return studentname;
	}
	int getRollno(){
		return rollno;
	}
	int getAge(){
		return age;
	}
	
	 public int compareTo(Object comparestu){
		    	int compareage=((Student)comparestu).getAge();
		    	return this.age-compareage;
		    } 
		   

	 public String toString() {
			       return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + age + "]";
			    }
  
		    
}

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Manu",223,26));
		list.add(new Student("Anu",456,23));
		list.add(new Student("Vinu",112,22));

		//sorting based on student age
	Collections.sort(list);
		for(Student str : list){
			System.out.println(str);
	}
		
		
	}
}
	
