package jun08;

//2~9단 for문
public class Test02 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				// System.out.println(i +"X" + j + "=" + i*j);

				System.out.printf("%d X %d = %d\t", i, j, (i * j));

			}
			System.out.println(i + "단");
		}
	
	}
}
