package Time;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar ga=Calendar.getInstance();//���÷����ʼ��
		
		int year = ga.get(Calendar.YEAR);
		int month =ga.get(Calendar.MONTH)+1;
		int day = ga.get(Calendar.DAY_OF_MONTH);
		int hour=ga.get(Calendar.HOUR_OF_DAY);
		int minute=ga.get(Calendar.MINUTE);
		int second=ga.get(Calendar.SECOND);
		int weekday=ga.get(Calendar.DAY_OF_WEEK);
		String[] DAY= {"������","����һ","���ڶ�","������","������","������","������"};
		System.out.println("������:"+year+"��"+month+"��"+day+"��"+DAY[weekday]+hour+":"+minute+":"+second);
		
		ga.add(Calendar.YEAR, 1);
		int nextYear=ga.get(Calendar.YEAR);
		System.out.println("���������"+nextYear+"��"+month+"��"+day+"��");
	}
}
