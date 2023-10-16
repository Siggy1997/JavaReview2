package Team;

import java.util.Arrays;
import java.util.Scanner;

//음수가 아닌 수들이 주어졌을 때 그 수들을 이어서 만들 수 있는 가장 큰 수를 구하시오.
//예를 들어 [1,2,3]이 주어졌을 때 만들 수 있는 가장 큰 수는 321이고,
//[3, 30, 34, 5, 9] 가 주어지면 만들 수 있는 가장 큰 수는 9534330이다.

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		String[] split = input.split(" ");

		int[] numbers = new int[split.length];
		char[] chArray = new char[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
			chArray[i] = split[i].charAt(0);
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (chArray[i] < chArray[j]) {
					// 15 8 7 94 13
				//	System.out.println("(" + i + "" + j + ")");
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(numbers));

	}
}
