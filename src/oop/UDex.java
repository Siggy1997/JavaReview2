package oop;

import java.util.Scanner;


	class UD {
		int randNum() {
			return (int) (Math.random() * 100 + 1);
		}

		int up(int num) {
			System.out.println("UP");
			return ++num;
		}

		int down(int num) {
			System.out.println("DOWN");
			return ++num;
		}
	}
	
	public class UDex {
		public static void main(String[] args) {
			UD ud = new UD();

			int num = ud.randNum();
			int ans = 0;
			int count = 0;

			Scanner sc = new Scanner(System.in);

			while (num != ans) {
				System.out.print("Input Number(1~100) : ");
				ans = sc.nextInt();

				if (num > ans) {
					count = ud.up(count);
				} else if (num < ans) {
					count = ud.down(count);
				} else {
					System.out.printf("정답 %d\n", ++count);
				}
			}
		}
	
}
