package Lv6_07_Clone;

import java.util.Scanner;

class Lms {
	String name = "";

	int[] arHakbun = { 1, 2, 3, 4, 5 };
	int[] arScore = { 10, 50, 30, 100, 80 };
}

public class Day43_ex02_성적확인 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lms ezen = new Lms();
		ezen.name = "이젠학원";

		while (true) {
			System.out.println("=== " + ezen.name + " ===");
			System.out.println("1. 전교생 성적 확인");
			System.out.println("2. 1등 학생 성적 확인");
			System.out.println("3. 꼴등 학생 성적 확인");
			System.out.println("4. 성적 확인하기");
			System.out.println("5. 종료하기");

			System.out.print("menu : ");
			int sel = scan.nextInt();
			
			int size = ezen.arHakbun.length;
			
			if(sel ==1) {
				for(int i=0; i<size; i++) {
					System.out.printf("%d) %d점\n", ezen.arHakbun, ezen.arScore);
				}
				
			} else if(sel == 2) {
				int max = ezen.arScore[0];
				int idx = 0;
				
				for(int i=0; i<size; i++) {
					if(max < ezen.arScore[i]) {
						max = ezen.arScore[i];
						idx = i;
					}
				}
				System.out.printf("1등 %d, %d점", ezen.arHakbun[idx],max);
				
			} else if(sel == 3) {
				int min = ezen.arScore[0];
				int idx = 0;
				
				for(int i=0; i<size; i++) {
					if(min > ezen.arScore[i]) {
						min = ezen.arScore[i];
						idx = i;
					}
				}
				System.out.printf("꼴등 %d, %d점", ezen.arHakbun[idx], min);
			} else if(sel == 4) {
				System.out.println("성적 확인할 학번을 입력하세요");
				int hakbun = scan.nextInt();
				int idx = -1;
				
				for(int i=0; i<size; i++) {
					if(ezen.arHakbun[i] == hakbun) {
						idx = i;
					}
				}
				
				if(idx != -1) {
					System.out.printf("%d : %d점", hakbun, ezen.arScore[idx]);
				} else {
					System.out.println("존재하지 않는 학번");
				}
				
				
			} else if(sel == 5) {
				break;
			}
			
			
			
			
		}

	}
}