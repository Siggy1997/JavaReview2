package jun09;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		boolean check = false;
		int[][] sam = new int[3][3];

		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
				sam[i][j] = (int) (Math.random() * 9 + 1);
				if (i + j != 0) {
					for (int k = 0; k < sam.length; k++) {
						for (int l = 0; l < sam.length; l++) {
							if (sam[i][j] == sam[k][l] && !(i == k && j == l)) {
								check = true;
							}
						}
					}
				}
				if (check) {
					j--;
					check = false;
				}
			}
		}
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}

	}
}