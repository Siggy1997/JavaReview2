package jun07;
//별찍기

//2023/06/07 응용 SW 기초기술 활용

import java.util.Iterator;

public class For01 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("_");
			}
			
		}
		for (int k = 5; k > 0; k--) {
			for(int l = 0; l<=k; l++) {
			System.out.print("*");
		}System.out.println("");
		}

		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 5; j > i; j--) {
		 * System.out.print("*"); } System.out.println(""); }
		 * 
		 * for (int i = 5; i > 0; i--) { for (int j = 0; j < i; j++) {
		 * System.out.print("*"); } System.out.println(""); } /* ____* ___** __*** _****
		 *****
		 */

	}
}