package jun08;

public class Test01 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			// System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("2 X %d = %d\n", i, (2 * i)); // %d는 정수
		}
		// %d = 정수      (byte, short, int, long)
		// \%f = 실수     (float, double)
		// %c = 문자      (char)
		// %s = 문자열    (string)
		// %b = 불린      (boolean)
		// \n = 줄바꿈
		// \t = tab키
		// \o 8진수
		// \x = 16진수

		String name = "홍길동";
		System.out.printf("제이름은 %s 입니다\n", name);
		double pi = 3.14;
		System.out.printf("파이는 %f 입니다.\n", pi);
		System.out.printf("파이는 %.2f 입니다.\n", pi);

		int money = 5000;
		System.out.printf("제 용돈은 %d원 입니다.\n", money);    // 5000
		System.out.printf("제 용돈은 %,d원 입니다.\n", money);   // 5,000
		System.out.printf("제 용돈은 %,10d원 입니다.\n", money); // 10자리를 만들고 5,000을 오른쪽으로 정렬
		System.out.printf("제 용돈은 %-10d원 입니다.\n", money); // 10자리를 만들고 5000을 왼쪽으로 정렬
		System.out.printf("제 용돈은 %010d원 입니다.\n", money); // 10자리를 만들고 5000을 오른쪽으로 정렬 후 앞에 0을 붙인다

		System.out.printf("제 이름은 %s입니다\n", name);
		System.out.printf("제 이름은 %10s입니다\n", name);

		char ch = 65;
		System.out.printf("제 이름은 %c입니다\n", ch);
		System.out.printf("제 이름은 %10d입니다\n", 1000); // 오른쪽 정력
		System.out.printf("제 이름은 %-10d입니다\n", 1000); // 왼쪽 정렬
		System.out.printf("제 이름은 %010d입니다\n", 1000);// 0000

		// 2번

	}
}
