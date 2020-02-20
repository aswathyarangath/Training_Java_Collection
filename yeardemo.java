import java.time.Year;
public class yeardemo{
	public static void main(String args[]){
		Year year=Year.of(2020);
		System.out.println(year.length());
	}
}