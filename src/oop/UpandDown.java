package oop;

import java.util.Scanner;

/*
 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
사용자는 이 숫자를 맞추어야 합니다.
입력한 숫자보다 정답이 크면 → "UP" 출력,
입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
 */

public class UpandDown {
	
	int input;
	int num;

	public int pick() {
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		return input;
	}

	public int random() {
		num = (int) (Math.random() * 100) + 1;
		return num;
	}



	public String up() {
		System.out.println("UP");
		return "up";
	}

	public String down() {
		System.out.println("DOWN");
		return "down";
	}

	public String same() {
		System.out.println("CORRECT");
		return "same";
	}

	public static void main(String[] args) {
		UpandDown ud = new UpandDown();
		
		int a = 0;
	
		int b = ud.random();
		while (a != b) {
			System.out.print("1~100고르세요 : " );
			a = ud.pick();
		
			if (a < b) {
				ud.up();
			} else if (a > b) {
				ud.down();
			} else {
				ud.same();
			}
		
		}

	}
}
