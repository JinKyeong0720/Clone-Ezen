package Lv06_07_Notion_clone;


	class Ex01{
		int x;
		int y;
	}
	public class Notion_6_1_01_클래스이론1 {
	
		/*
		 * # 클래스
		 * 1. 정의(설계도)
		 * 	1) class : 키워드
		 *  2) Ex01 : 클래스명
		 *  3) {} : 자료형의 영역(기본 자료형을 조합해 생성)
		 *  
		 * 2. 선언
		 *  1) 자료형  변수명  =  new 자료형 () ;
		 *  2) Ex01    e    =  new Ex01 () ;
		 */
		
	public static void main(String[] args) {
		
		
		Ex01 e = new Ex01(); // 클래스 : 사용자 정의 자료형(개발자가 직접 입력)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e); // 주소 나옴. 클래스도 주소변수임
		// ㄴ> Lv6_Notion_clone.Ex01@1d371b2d
		System.out.println(e.x); 
		// ㄴ 10
		System.out.println(e.y);
		// ㄴ 20
		// 아래 배열과 같은 느낌으로 사용하면 됨
		
		// --------------------------------------------------------------
		int arr[] = new int[3];
		System.out.println(arr);
		// ㄴ [I@543c6f6d
		
	}
}
