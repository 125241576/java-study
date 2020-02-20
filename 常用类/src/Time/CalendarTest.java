package Time;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar ga=Calendar.getInstance();//利用反射初始化
		
		int year = ga.get(Calendar.YEAR);
		int month =ga.get(Calendar.MONTH)+1;
		int day = ga.get(Calendar.DAY_OF_MONTH);
		int hour=ga.get(Calendar.HOUR_OF_DAY);
		int minute=ga.get(Calendar.MINUTE);
		int second=ga.get(Calendar.SECOND);
		int weekday=ga.get(Calendar.DAY_OF_WEEK);
		String[] DAY= {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println("现在是:"+year+"年"+month+"月"+day+"日"+DAY[weekday]+hour+":"+minute+":"+second);
		
		ga.add(Calendar.YEAR, 1);
		int nextYear=ga.get(Calendar.YEAR);
		System.out.println("明年今日是"+nextYear+"年"+month+"月"+day+"日");
	}
}
