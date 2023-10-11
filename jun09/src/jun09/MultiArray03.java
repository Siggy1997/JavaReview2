package jun09;

import java.util.Scanner;

public class MultiArray03 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력하세요 : ");
		int input = sc.nextInt();
		char k = (char)78;
		int[][] arr01 = new int[input][input];

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				if (i == j) {
					arr01[i][j] = k;
					System.out.print(arr01[i][j] + "	");
				} else if (j == 0 || j == input - 1) {

					arr01[i][j] = k;
					System.out.print(arr01[i][j] + "	");

				} else {
					System.out.print(arr01[i][j] + "	");

				}
			}
			System.out.println("");

		}
	}
}
