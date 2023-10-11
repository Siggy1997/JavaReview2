package jun07;

import java.util.Iterator;

public class Test08_For {
	
	public static void main(String[] args) {
		//1~10까지 출력 ---> 1~10까지 모든 숫자를 더하면? 55
		int sum = 0;
		for(int i = 0; i <= 10; i +=2) {
		
			sum += i; // sum = sum +i;
			System.out.println(i);
		
		}
		System.out.println(sum);

	}
}
