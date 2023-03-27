package Lv6_Notion_clone;

import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Notion_6_1_03_클래스문제2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex04 e = new Ex04();

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for(int i=0 ; i<e.scores.length ; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		double average = 0.0;
		for(int i=0; i<e.scores.length; i++) {
			total += e.scores[i];
		}
		average = total/e.scores.length;
		System.out.println("문제 2) ");
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f\n", average);
		

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int passStudent = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				passStudent++;
			}
		}
		System.out.printf("문제 3) 60점 이상 합격생 수 : %d명\n", passStudent);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.print("문제 4) 인덱스 입력 : ");
		int index = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(i==index) {
				System.out.println(e.scores[i]);
			} 
		}

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.print("문제 5) 성적 입력 : ");
		int score = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] == score) {
				System.out.println(i);
			}
		}

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		System.out.print("문제 6) 학번 입력 : ");
		int num = scan.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == num) {
				System.out.println(e.scores[i]);
			}
		}
		
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.print("문제 7) 학번 입력: ");
		num = scan.nextInt();
		int check = -1;
		
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == num)
				check = i;
		}
		if(check != -1) { // check == i
			System.out.println(e.scores[check]);
		} else {
			System.out.println("해당 학번은 존재하지 않음");
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int topScore = 0;
		int topIndex = 0;
		
		for(int i=0; i<e.scores.length; i++) {
			if(topScore < e.scores[i]) {
				topScore = e.scores[i];
				topIndex = i;
			}
		}
		System.out.println("문제 8) 1등 학생 학번과 성적 : "+ e.hakbuns[topIndex]+"번 " + topScore+"점");
	}
}
