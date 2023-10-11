package jun08;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		System.out.println("암호화 할 문장을 입력하세요");
		System.out.print("입력 : ");
		input = sc.nextLine();
		// 입력 받은 문장을 모두 대문자화 하기
		input = input.toUpperCase();
		// input.toLowerCase()
		// System.out.println(input);
		// String to char
		char[] chInput = input.toCharArray();
		System.out.println(Arrays.toString(chInput));

		for (int i = 0; i < chInput.length; i++) {
			if (chInput[i] > 87) {
				System.out.print((char) (chInput[i] - 23));
			} else {
				System.out.print((char) (chInput[i] + 3));
			}
		}

	}
}
