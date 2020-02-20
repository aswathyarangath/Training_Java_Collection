import java.time.*;
import java.time.temporal.ChronoUnit;
public class LocalTimeExample5{
	public static void main(String args[]){
		ZoneId zone1=ZoneId.of("Australia/Sydney");
		ZoneId zone2=ZoneId.of("Asia/Kolkata");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("India Time Zone: "+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("India Time Zone: "+time2);
		long hours= ChronoUnit.HOURS.between(time1,time2);
		System.out.println("Hours between two time zone:"+hours);
		long minutes= ChronoUnit.MINUTES.between(time1,time2);
		System.out.println("Minutess between two time zone:"+minutes);
	}
}