 package Lv6_07_Clone;

// 클래스 정의
// class 클래스명 {}

// 클래스가 가질 수 있는 요소 2가지
// 멤버변수, 메소드

class Person {
	String name;
	int age;
	int gender; 
	String language;
}

public class Day43_ex01_객체개념 {
	public static void main(String[] args) {
		// 클래스를 통한 객체 생성
		// 선언 :: 클래스명 변수명;
		Person jin; // 선언
		jin = new Person(); // 초기화
		
		// 초기화 :: new 클래스명();
		Person jini = new Person(); // class Person 갖고 jini라는 Person타입 객체 생성
		System.out.println(jini); //Lv6_07_Clone.Person@1d371b2d
		// ㄴ 힙에 할당된 메모리
		
		// 객체가 가지는 멤버변수에 접근(사용)
		jini.name = "지니";
		System.out.println(jini.name);
		
		jini.age = 78;
		System.out.println(jini.age);
		
		jini.gender = 1;
		System.out.println(jini.gender);
		
		jini.language = "영어";
		System.out.println(jini.language);
		
	}
}
