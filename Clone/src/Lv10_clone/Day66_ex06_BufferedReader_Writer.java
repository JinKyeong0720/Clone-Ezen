package Lv10_clone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day66_ex06_BufferedReader_Writer {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		StringBuffer buffer = new StringBuffer();
		
		try {
			System.out.print("입력 : \n");
			br = new BufferedReader(new InputStreamReader(System.in)); // 입력
			bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 
			
			buffer.append(br.readLine());
			
			bw.write(buffer.toString());
			bw.flush();
		} catch (Exception e) {
		}
	}
}
