package Team;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		// compareTo :문자열로 이어붙인 결과를 나타냅니다
		// 두 문자열이 같으면 0을 반환하고,
		// 첫 번째 문자열이 두 번째 문자열보다 작으면 음수를 반환하고,
		// 첫 번째 문자열이 두 번째 문자열보다 크면 양수를 반환합니다.
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");

		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if ((split[i] + split[j]).compareTo(split[j] + split[i]) < 0) {

					String temp = split[i];
					split[i] = split[j];
					split[j] = temp;
				}
			}
		}
		String largestNum = String.join("", split);
		System.out.println("만들수 있는 가장 큰수 : " + largestNum);

	}

}