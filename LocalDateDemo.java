import java.time.LocalDate;
public class LocalDateDemo{
	public static void main(String args[]){
		LocalDate date=LocalDate.now();
		LocalDate ystday=date.minusDays(1);
		LocalDate tmw=date.plusDays(2);
		System.out.println("Yesterday :"+ystday);
		System.out.println("Today :"+date);
		System.out.println("Tommorow:"+tmw);
		}
}
		