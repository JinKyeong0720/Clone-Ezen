package Lv10_Notion_clone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Day61_ex03_Timer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		
		while(true){
			System.out.print("분 : ");
			int min = scan.nextInt();
			System.out.print("초 : ");
			int sec = scan.nextInt();
			
			int time = min * 60 + sec;
			while(time > 0) {
				Calendar now = Calendar.getInstance();
				System.out.print(sdf.format(now.getTime()));                     
				
				System.out.printf("(%2d분 %2d초 남음 )\n", time/60, time%60);
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				time --;
			}
			System.out.println("Time out !");
			System.out.println();
			
		}
	}
}
