package jun08;

import java.util.Arrays;

// 알파벳을 A-Z 까지 저장하는 배열을 만들어주세요
public class Array03 {
	public static void main(String[] args) {

		char[] al = new char[26];
		for (int i = 0; i < 26; i++) {
			al[i] = (char) (i + 65);

		}
		System.out.println(Arrays.toString(al));
	}
}
