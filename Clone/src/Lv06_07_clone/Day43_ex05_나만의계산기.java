package Lv06_07_clone;

import java.util.Scanner;

class Operator{
	Scanner scan = new Scanner(System.in);
	
	void sum () {
		System.out.print("더할 숫자 1 : ");
		int num1 = scan.nextInt();
		System.out.print("더할 숫자 2 : ");
		int num2 = scan.nextInt();
		System.out.println("합 : " + (num1 + num2));
	}
	
	void minus (int num1, int num2) {
		System.out.println("차 : " + (num1 - num2));
	}
	
	double div () {
		double num3 = scan.nextDouble();
		double num4 = scan.nextDouble();
		return num3 / num4;
	} 
	
	
	
}


public class Day43_ex05_나만의계산기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Operator op = new Operator();
		
		op.sum();
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		op.minus(num1, num2);
		
//		double result = op.div(); // 이거 역할 ?
//		System.out.println(result);
		System.out.println(op.div());
		
	}
}
