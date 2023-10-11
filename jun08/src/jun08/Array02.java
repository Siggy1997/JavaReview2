package jun08;

import java.util.Arrays;

public class Array02 {
	/*
	 * 배열 (Array) 일단, 무조건 하나만 기억해주세요 배열은 객체입니다. 
	 * 그리고 객체는 기본적으로 속성과 메소드를 가지고있습니다 이중
	 * 배열만 유일하게 속성만 가지고 있습니다 배열은 동일한 타입의 데이터를 
	 * 하나의 묶음으로 관리하기 위해 사용되는 데이터 구조입니다 예를 들어
	 * int타입의 변수가 100개가 필요하다면? 우리는 100개의 다른 이름, 
	 * 다른 변수를 만들어야합니다 시간도 많이 걸리고 관리하기
	 * 어려워집니다
	 * 
	 * 이를 보안하기 위해서 사용하는 것이 배열입니다
	 * 
	 * 배열은 객체라고 했기 때문에 객체의 속성과 메소드를 사용해서 배열을 관리합니다 
	 * 배열은 유일하게 속성만 가지고 있습니다 배열의 속성중 배열의
	 * 길이를 나타내느 length가 있습니다 개체의 속성과 메소드 등을 
	 * 호출할때는 .(점) 을 사용합니다
	 * 
	 */
	public static void main(String[] args) {
		// 10, 9, 8, 6, 5, 4, 3, 2, 1 = length 10
		int[] arr01 = new int[10];
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = 10 - i;

		}
		System.out.println(Arrays.toString(arr01));

		// 생성 + 값입력
		int[] arr02 = new int[] {  };
		System.out.println(Arrays.toString(arr02));
		int[] arro03 = { 5, 4, 3, 2, 1 };

		int[] S = { 1, 3, 4, 8, 13, 17, 20 };
		int fir = 1;
		int sec = 3;
		int temp = S[1] - S[0];

		for (int i = 0; i < S.length - 1; i++) {
			if (S[i + 1] - S[i] < temp) {
				temp = S[i + 1] - S[i];
				fir = S[i];
				sec = S[i + 1];

			}
			// System.out.print(S[i - 1] + "," + S[i] + " : ");
			// System.out.println(Math.abs(S[i - 1] - S[i]));

		}
		System.out.println("두 거리의 차가 가장 작은 숫자는");
		System.out.println(fir + ", " + sec);

	}

}
