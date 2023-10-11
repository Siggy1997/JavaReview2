package jun07;

import java.util.Scanner;

public class Ifif {
	public static void main(String[] args) {
		System.out.println("아이디 입력");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		System.out.println("비밀번호 입력");
		String PW = sc.nextLine();
		if(ID.equals("admin")) {
			if (PW.equals("1234")) {
				System.out.println("ID, PW Correct");
				
			} else {
				System.out.println("PW incorrect");
			}
		} else {
			System.out.println("ID incorrect");
		}

	}
}
