package Lv10_Notion_clone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day61_ex01_Calendar_개념 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); // Mon Mar 27 22:50:35 KST 2023

		System.out.println(date.getTime()); // 1679925062907

		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date)); // 23. 3. 27. 오후 10:51
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss.S");
		System.out.println(sdf1.format(date)); // 2023-03-27, 10:52:27.74
		
		System.out.println(sdf.format(System.currentTimeMillis()));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		
		long time = cal.getTimeInMillis();
		System.out.println(time); // 1679925239747
		
		System.out.println(cal.get(Calendar.YEAR)); // 2023
		System.out.println(cal.get(Calendar.MONTH)+1); // 3
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 27
		System.out.println(cal.get(Calendar.HOUR)); // 10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 22
		System.out.println(cal.get(Calendar.MINUTE)); // 54
		System.out.println(cal.get(Calendar.SECOND)); //21
		System.out.println(cal.get(Calendar.MILLISECOND)); // 531
	}
}
