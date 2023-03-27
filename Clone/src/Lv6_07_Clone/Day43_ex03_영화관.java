package Lv6_07_Clone;

import java.util.Scanner;

class Cinema {
	String brandName;
	final int SIZE = 7;
	int[] seats = new int[SIZE];
	Payment payment = new Payment();

}

class Payment {
	int total;
	int salesCount;
	int price = 12000;
}

public class Day43_ex03_영화관 {
	public static void main(String[] args) {

		Cinema cinema = new Cinema();
		cinema.brandName = "CGV";
		
		int size = cinema.SIZE;
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			// 좌석 출력
			for(int i=0; i<size; i++) {
				System.out.printf("%d ", i +1);
			}
			
			for(int i=0; i<size; i++) {
				System.out.printf("%s ", cinema.seats[i] == 1 ? "F" : "T");
			}
			
			System.out.println("\n1) 좌석 예매");
			System.out.println("2) 좌석 취소");
			System.out.println("3) 종료");
			System.out.print("menu : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("예매할 좌석 번호");
				int select = scan.nextInt()-1;
				
				if(select >=0 && select < size) {
					if(cinema.seats[select] == 0) {
						cinema.seats[select] = 1;
						cinema.payment.salesCount ++; // cinema 클래스랑 payment 클래스랑 어떻게 연결됨 ?
						cinema.payment.total = cinema.payment.price * cinema.payment.salesCount;
					} else {
						System.out.println("이미 선택된 좌석임");
					}
				} else {
					System.out.println("잘못된 범위 선택함");
				}
			} else if (sel == 2){
				System.out.println("취소할 좌석 번호");
				int cancle = scan.nextInt()-1;
				
				if(cancle >= 0 && cancle < size) {
					if(cinema.seats[cancle] == 1) {
						cinema.seats[cancle] = 0;
						cinema.payment.salesCount--;
						cinema.payment.total = cinema.payment.price * cinema.payment.salesCount;
					}
				}
			} else if (sel ==3) {
				System.out.printf("총 매출액 : %d원", cinema.payment.total);
				break;
			}
			
			
		}
		
	}
}
