package Lv6_Notion_clone;

class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}

public class Notion_6_1_02_클래스문제1 {
	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// 문제 1) 전체 합 출력 (362)
		int total = 0;
		for(int i=0; i<e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.printf("문제 1 : 전체 합은 %d\n", total);
		
		// 문제 2) 4의 배수의 합 출력 (264)
		total = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				total += e.arr[i];
			}
		}
		System.out.printf("문제 2 : 4의 배수의 합은 %d\n", total);
		
		// 문제 3) 4의 배수의 개수 출력 (3)
		int count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.printf("문제 3 : 4의 배수의 개수는 %d\n", count);

		// 문제 4) 짝수의 개수 출력 (3)
		count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.printf("문제 4 : 짝수의 개수는 %d\n", count);

		
		
	}
}
