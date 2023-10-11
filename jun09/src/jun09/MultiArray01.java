package jun09;

import java.util.Iterator;

//2차원 배열
/*
 * 배열속에 배열이 있습니다.
 */
public class MultiArray01 {
	public static void main(String[] args) {

		int[] arr01 = new int[5];
		int[][] arr02 = new int[5][5];

		// 데이터 입력
		arr01[0] = 100;
		arr02[0][0] = 100; // [집][방번호]

		// 마지막집,마지막 방에 1000을 저장장하기
		arr02[4][4] = 1000;

		// index 2, index마지막 방에 55를 저장하기
		arr02[2][4] = 55;

		// 출력
		/*
		 * System.out.println(arr02[0][0]); System.out.println(arr02[0][1]);
		 * System.out.println(arr02[0][2]); System.out.println(arr02[0][3]);
		 * System.out.println(arr02[0][4]); System.out.println(arr02[1]);
		 * System.out.println(arr02[2]); System.out.println(arr02[3]);
		 * System.out.println(arr02[4]);
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("arr02[%d][%d] : \t", i, j);
				System.out.print(arr02[i][j] + "	");

			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");

		int[][] arr03 = new int[2][3];
		for (int i = 0; i < arr03.length; i++) {
			for (int j = 0; j < arr03[i].length; j++) {
				System.out.print(arr03[i][j] + "	");
			}
			System.out.println("");
		}
		System.out.println(arr03.length); // 2
		System.out.println(arr03[0].length); // 3
		int[] temp = arr03[0];
		System.out.println(temp.length); // 3

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int[][] arr04 = new int[3][2];
		for (int i = 0; i < arr04.length; i++) {
			for (int j = 0; j < arr04[i].length; j++) {  // arr04[i]
				System.out.println(arr04[i][j] + "	");

			}
			System.out.println("");
		}

	}

}
