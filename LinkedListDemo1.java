import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}

}
public class LinkedListDemo1{
	public static void main(String args[]){
		//creating list of books
		List<Book> list=new LinkedList<Book>();
		//creating books
		Book b1=new Book(101,"Thinking java","Maneet Kanna","Pearson",4);
		Book b2=new Book(102,"System Software","Girija","Mc GrawHill",7);
		Book b3=new Book(103,"Complete Reference","Herbert","Apn",3);
		//Adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//traversing list
		for(Book b:list){
			System.out.println(b.id+ " "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
		