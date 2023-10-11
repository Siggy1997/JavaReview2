package jun09;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//
public class Test01 {
	public static void main(String[] args) {

		int[] arr01 = new int[5];
		arr01[arr01.length - 1] = 4; // 마지막번째

		System.out.println(arr01); // 저장 주소
		System.out.println(arr01[0]); // 0번지에 저장된 값

		// 사용자가 점수 입력을 하면 arr01에 저장하고 출력하기
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr01.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			arr01[i] = sc.nextInt();
		}
		// 출력
		System.out.println(Arrays.toString(arr01));
		// 닫기

		// 출력
		System.out.println(Arrays.toString(arr01));
		
		for (int i = 0; i < arr01.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			arr01[i] = sc.nextInt();

		}
		// 닫기
		sc.close();

	}
}
