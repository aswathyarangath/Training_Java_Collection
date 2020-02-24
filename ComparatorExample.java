
	package collection.list;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class StudentEg{
		
		String studentname;
		int rollno;
		int age;
		StudentEg(String studentname,int rollno,int age){
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
		
		 public static Comparator<StudentEg> StuNameComparator = new Comparator<StudentEg>() {
			 	@Override
				public int compare(StudentEg s1, StudentEg s2) {
				   String StudentName1 = s1.getStudentname().toUpperCase();
				   String StudentName2 = s2.getStudentname().toUpperCase();

				   //ascending order
				  // return StudentName1.compareTo(StudentName2);

				   //descending order
				   return StudentName2.compareTo(StudentName1);
			    }};
			  public String toString() {
			       return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + age + "]";
			    }
			   		    
	}

	public class ComparatorExample {
		public static void main(String[] args) {
			ArrayList<StudentEg> list=new ArrayList<StudentEg>();
			list.add(new StudentEg("Manu",223,26));
			list.add(new StudentEg("Anu",456,23));
			list.add(new StudentEg("Vinu",112,22));
			
			Collections.sort(list,StudentEg.StuNameComparator);
		
			for(StudentEg str : list){
				System.out.println(str);
			}
		
		}
	}
		

