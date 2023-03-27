package Lv6_Notion_clone;

import java.util.Scanner;

class Ex05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class Notion_6_1_04_클래스문제3 {
	public static void main(String[] args) {
		
		/*
		 * System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
		 */
		
		Scanner scan = new Scanner(System.in);
		Ex05 ezen = new Ex05();
		ezen.name = "EZEN ACADEMY";
		
		while(true) {
			// 메뉴 출력
			System.out.println();
			System.out.println("=== " + ezen.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			System.out.println();
			
			// 전교생 성적확인
			if(choice == 1) {
				int total = 0;
				for(int i=0; i<ezen.arScore.length; i++) {
					total += ezen.arScore[i];
				}
				double average = total / ezen.arScore.length;
				System.out.printf("전교생 수 : %d명\n", ezen.arScore.length);
				System.out.printf("전교생 총점 : %d점\n", total);
				System.out.printf("전교생 평균 : %.2f점\n", average);
			}
			
			// 1등학생 성적확인
			else if(choice == 2) {
				int topScore = ezen.arScore[0]; // 배열이라 냅다 0으로 초기화 못함
				int topIndex = 0;
				for(int i=0; i<ezen.arScore.length; i++) {
					if(topScore < ezen.arScore[i]) {
						topScore = ezen.arScore[i];
						topIndex = i;
					}
				}
				System.out.printf("1등 학번 : %d\n", ezen.arHakbun[topIndex]);
				System.out.printf("1등 성적 : %d\n", topScore);
			}
			
			// 꼴등학생 성적확인
			else if(choice == 3) {
				int minScore = ezen.arScore[0];
				int minIndex = 0;
				for(int i=0; i<ezen.arScore.length; i++) {
					if(minScore > ezen.arScore[i]) {
						minScore = ezen.arScore[i];
						minIndex = i;
					}
				}
				System.out.printf("꼴등 학번 : %d\n", ezen.arHakbun[minIndex]);
				System.out.printf("꼴등 성적 : %d\n", minScore);
			}
			
			// 성적 확인하기
			else if(choice == 4) {
				System.out.print("학번 입력 : ");
				int hakbun = scan.nextInt();
				
				int check = -1;
				for(int i=0; i<ezen.arHakbun.length; i++) {
					if(ezen.arHakbun[i] == hakbun) {
						check = i;
					}
				}
				
				if(check != -1) {
					System.out.printf("%d번 학생의 성적은 %d점 입니다.\n", hakbun, ezen.arScore[check]);
				} else {
					System.err.println("해당 학번이 존재하지 않습니다.\n");
				}
			}
			
			// 종료하기
			else if(choice == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}
}
