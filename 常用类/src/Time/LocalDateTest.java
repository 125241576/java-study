package Time;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();//当前日期
		System.out.println(ld);
		
		LocalDate firstDay_2020=LocalDate.of(2020, 1, 1);//设置日期
		System.out.println(firstDay_2020);
		
		//2020的第100天
		LocalDate hundredday_2020=LocalDate.ofYearDay(2020, 100);
		System.out.println(hundredday_2020);
	}

}
