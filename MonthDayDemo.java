import java.time.*;
public class MonthDayDemo{
	public static void main(String args[]){
		MonthDay month=MonthDay.now();
		boolean b=month.isValidYear(11111);
		System.out.println(b);
	}
}