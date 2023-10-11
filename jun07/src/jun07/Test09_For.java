
package jun07;

import java.util.Scanner;
//1. 2로 나눠서 나머지값을 출력
//2. 2로 나눈 몫을 num에 저장하기

public class Test09_For {
	
	public static void main(String[] args) {
		
		int num = 11;

		
		
		for (int i = 0; i<8; i++) {
			
			System.out.print(num%2);
			num = num/2;
		}
	}
}
