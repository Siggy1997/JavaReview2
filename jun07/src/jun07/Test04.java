package jun07;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 주민등록 번호 뒷자리 첫숫자를 임력했을때 남자인지, 여자인지 판별하는 프로그래
		// 840505 - 100000
		System.out.print("입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input % 2 == 1) {
			System.out.println("남자입니다");

		} else {
			System.out.println("여자입니다");
		}
		sc.close();
	}
}
