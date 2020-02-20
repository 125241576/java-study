package String;

import java.time.LocalDate;
import java.util.Calendar;

public class TimeDemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		int day_of_week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("今天是"+year+"年"+month+"月"+day+"日"+"星期"+day_of_week);
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.HOUR)+3);
		System.out.println(c.get(Calendar.MINUTE));
		c.set(c.get(Calendar.YEAR), 6, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		LocalDate l=LocalDate.now();
		System.out.println(l);
	}
}
