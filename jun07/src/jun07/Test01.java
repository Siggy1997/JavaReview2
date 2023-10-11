
package jun07;

import java.util.Scanner; // api

// 만들어보기
/*
 * 1.사용자가 입력한 숫자 (예 12) 입력받기 
 * 2.사용자가 입력한 10진법 숫자를 2진법 숫자로 출력하기
 * (예 당신이 입력한 숫자는 12입니다 2진법으로는 1100 입니다)
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 \n입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 입력대기
		System.out.println("2진법 출력 : " + Integer.toBinaryString(input));

		sc.close(); // scanner 닫기
	}
}
