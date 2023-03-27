package Lv10_clone;

import Lv10_clone.MusicBox;
import Lv10_clone.PlayGame;

class PlayGame extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("신나게 게임 중 . . .");
			try {
				sleep(200);
			} catch (Exception e) {
			}
			
		}
	}
}

class MusicBox implements Runnable {
	
	int time;
	
	@Override	
	public void run() {
		while(true) {
			if(time == 5)
				break;
			
			try {
				System.out.println("음악이 흐르는 중 ~");
				Thread.sleep(300);
			} catch (Exception e) {
			}
			time ++;
		}
	}
}


public class Day66_ex03_Thread {
	public static void main(String[] args) {
		PlayGame playGame = new PlayGame();
		playGame.start();
		
//		MusicBox music = new MusicBox();
//		music.run();
		// => Runnable 객체를 Thread로 
		Thread t = new Thread(new MusicBox());
		t.start();
		
		int n=1;
		while(true) {
			if(n == 10) {
				System.out.println("앗, 엄마가 나타났다 !");
				playGame.stop();
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			n++;
		}
		
		System.out.println("게임을 종료합니다.");
	}
}
