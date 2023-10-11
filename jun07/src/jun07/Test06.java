package jun07;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		// 아이디:admin 비밀번호:0123456
		String inputID, inputPW;

		String id = "admin";
		String pw = "01234567";

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 입력 : ");
		inputID = sc.nextLine();

		System.out.print("암호 입력 : ");
		inputPW = sc.nextLine();

		if (id.equals(inputID) && pw.equals(inputPW)) {
			System.out.println("정보가 일치합니다");

		} else {
			System.out.println("정보가 일치하지 않습니다");
		}

	}
}
