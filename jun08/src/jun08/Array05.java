package jun08;

//String 자르기
public class Array05 {
	public static void main(String[] args) {
		String word = "hello";

		System.out.println(word.length()); // word의 길이
		word.charAt(0); // 0번쨰
		System.out.println(word.charAt(4)); // 4번째 숫자 출력

		System.out.println(word.substring(3)); //3번째 부터 출력
		System.out.println(word.substring(1, 4)); //1~4째 출력

		String name = "가나다라마법사";
		// System.out.println( name.substring(4,7) );
		System.out.println(name.length()); //NAME의 길이
	}
}
