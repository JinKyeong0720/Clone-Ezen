package Lv06_07_clone;

class Student {
	String name;
	String major;
	int num;
	int score;
	int gender;
	int age;
	
	void printinfo() {
		System.out.println("num : " + num);
	}
	
	void sayhello(String message) {
		System.out.printf("%s야, %s~\n", name, message);
	}
	
	String getMajor() {
		return this.major;
	}
	
	String setMajor(String myMajor) {
		this.major = myMajor;
		return this.major;
	}
	
}


public class Day43_ex04_메소드_개념 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "jin";
		student.major = "Psychology";
		student.num = 1;
		student.score = 100;
		student.gender = 1;
		student.age = 24;
		
		student.sayhello("안녕!");
		
		System.out.println("get전공 : " + student.getMajor());
		System.out.println("set전공 : " + student.setMajor("science"));
	
		student.printinfo();
	}
}
