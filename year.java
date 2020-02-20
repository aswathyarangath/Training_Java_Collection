import java.time.LocalDate;
import java.time.Year;
public class year{
	public static void main(String args[]){
		Year y=Year.of(2020);
		LocalDate l=y.atDay(366);
		System.out.println(l);
	}
}