import java.util.Calendar;
import java.util.Date;
public class Calender
{
	public static void main(String args[])
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(2025,8,19);
		Date firstDate=calendar.getTime();
		calendar.set(2024,8,1);
		Date secondDate=calendar.getTime();
		System.out.println("Is FirstDate before Second Date?"+firstDate.before(secondDate));
		System.out.println("Is SecondDate after First Date?"+secondDate.before(firstDate));
	}

}