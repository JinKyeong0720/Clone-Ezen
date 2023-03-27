package Lv10_clone;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

abstract class Shape {
	int x;
	int y;
	String result;
	
	public Shape() {
		draw();
	}
	
	void move() {
		System.out.println("마우스가 움직이는 중 . . .");
	}
	
	abstract void draw();
	
	@Override
	public String toString() {
		return this.result;
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		super.result = "ㅇ";
	}
}

class Triangle extends Shape{
	@Override
	void draw() {
		super.result="△";
	}
}

class Square extends Shape{
	@Override
	void draw() {
		super.result = "⬛";
	}
}

class Line extends Shape{
	@Override
	void draw() {
		super.result = " | ";
	}
}

public class Day65_ex01_다형성 {
	
	public static final Random random = new Random();
	
	public static int random(int size) {
		return random.nextInt(size);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Shape> board = new ArrayList<Shape>();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();
		Line line = new Line();
		
		while(true) {
			System.out.println(board);
			System.out.println("1. Circle");
			System.out.println("2. Triangle");
			System.out.println("3. Square");
			System.out.println("4. Line");
			System.out.println("5. Random Shape");
			System.out.println("0. Quit");
			System.out.print("menu : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				board.add(new Circle());
			} else if(sel == 2) {
				board.add(new Triangle());
			} else if(sel == 3) {
				board.add(new Square());
			} else if(sel == 4) {
				board.add(new Line());
			} else if(sel == 5) {
				// 1. 보유중인 다형성 대상 클래스(자식클래스)의 이름 목록
				String[] shapes = new String[] {"Circle", "Triangle", "Square", "Line"};
				// 2. 클래스 이름 만들기(패키지명 꼭 포함해야 함)
				String className = "Lv10_clone" + shapes[random(shapes.length)];
				
				try {
					// 3.클래스 갖고오기
					Class<?> clazz = Class.forName(className);
					
					// 4. 갖고온 클래스로 생성자 갖고와서 인스턴스 생성
					// 4-1. 기본생성자 호출
					// Object object = clazz.getDeclaredConstructor().newInstance();
					
					// 4-2. 파라미터 필요 생성자 호출
					Class<?>[] paramList = new Class<?>[] {int.class, String.class};
					Object object = clazz.getDeclaredConstructor(paramList).newInstance(10, "육각형");
					
					// 5. 목적하는 다형성 객체 타입으로 형변환 가능한지 확인 후 사용
					if(object instanceof Shape) {
						Shape shape = (Shape) object;
						board.add(shape);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if(sel == 0)
				break;
		}
	}
}
