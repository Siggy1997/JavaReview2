package jun09;

import java.util.Arrays;

//자바의 랜덤 (난수) = 로또 45개 중에서 6개 
public class Test02 {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		// 랜덤 1.Math.random();
		for (int i = 0; i < 6; i++) {

			lotto[i] = (int) (Math.random() * 45 + 1);

			// System.out.print( (int) (Math.random() *45 +1) ); // 0.0~1.0

		}
		System.out.println(Arrays.toString(lotto));

		
		
		// 1~25중 하나만 뽑기
		System.out.println((int) (Math.random() * 26 + 1));
	}

}

