package jun08;

import java.util.Arrays;
import java.util.Scanner;

// 배열 : 같은 데이터타입이 줄줄이 있습니다.
// 같은 타입, 동일 관리, 주소 호출
public class Array01 {
	public static void main(String[] args) {
		
		//int 티입의 10개 공간을 만들겠습니다
		//데이터 타입 변수명
		int[] arr01 = new int[10];
		// 실수 타입( 더블) 형태의 배열 5칸 짜리를 생성해주세요
		double[] arr02 = new double[5];
		//문자열 3개를 저장하는 arr03
		String[] arr03 = new String[3];
		
		boolean[] arr04 = new boolean[5];
		
		System.out.println(arr01);
		
		System.out.println(arr01[0]);// 변수 [int index]  (해당위치)
		//입력 변수 [위치]
		
		arr01[0] = 100;
		arr01[1] = 10;
		arr01[2] = 50;
		
		arr03[0] = "홍길동";
		arr03[1] = "김길동";
		arr03[2] = "이길동";
		System.out.println(arr03.length); // .length = int타입의 길이
		for(int i = 0; i<arr03.length; i++) {
			System.out.println(arr03[i]);
		}
		for(int i= 0; i<arr01.length; i++) {
			arr01[i] = i+1;
			
		}
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr03));
		System.out.println(Arrays.toString(arr02));
		System.out.println(Arrays.toString(arr04));
		//초기값 = 객체는 객체 생성과 동시에 초기값을 가집니다.
		// 정수 = 0,   실수 = 0.0,   객체(String) = null   char = , boolean = false 
		String[] test01 = new String[3];
		System.out.println(Arrays.toString(test01));
		
		char[] test02 = new char[3];
		System.out.println(Arrays.toString(test02));
		
		Scanner[] test03 = new Scanner[3];
		System.out.println(Arrays.toString(test03));
		
		Object[] test04 = new Object[3];
		System.out.println(Arrays.toString(test04));
		
		
		
		
	}

}