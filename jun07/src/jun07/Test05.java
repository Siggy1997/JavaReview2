package jun07;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		// 90~100 A
		// 80~89 B
		// 70~79 C
		// 0~69 F
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 70) {
			System.out.println("F");

		} else if (input < 80) {
			System.out.println("C");

		} else if (input < 90) {
			System.out.println("B");

		} else {
			System.out.println("A");
		}
	}
}
