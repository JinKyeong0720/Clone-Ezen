package Lv06_07_Notion_clone;

class Ex02 {
	String name;
	int score;
}

public class Notion_6_1_01_클래스이론2 {
	public static void main(String[] args) {

		Ex02 hgd = new Ex02();
		hgd.name = "홍길동";
		hgd.score = 100;

		System.out.println(hgd.score);
		// ㄴ 100

		// 같은 패키지 안의 다른 클래스는 다른 클래스에서 사용 가능함
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
	}
}
