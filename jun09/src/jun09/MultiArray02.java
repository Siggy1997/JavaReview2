package jun09;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MultiArray02 {

	public static void main(String[] args) {
		// 1~25 5X5

		int[][] arr01 = new int[5][5];
		int k = 1;

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = k++;

				System.out.print(arr01[i][j] + "	");
			}
			System.out.println("");
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// for each = 거의 출력할 때만 사용

		for (int[] is : arr01) { // 내부 요소 : 집합
			for (int i : is) {
				System.out.print(i + "	");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");

		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < arr01.length; i++) {
			System.out.println(Arrays.toString(arr01[i]));

		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int kk =1;
		int[][] arr02 = new int[7][7];
		for (int i = 0; i < arr02.length; i++) {
				for (int j = 0; j < arr02[i].length; j++) {
					if (j == 0 || j == 6) {
						arr02[i][j]= kk;
						System.out.print(arr02[i][j] + "	");
						
					} else
						System.out.print(arr02[i][j] + "	");

				}
			System.out.println("");
			
		}

	}

}
