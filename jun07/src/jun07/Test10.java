package jun07;

public class Test10 {
	public static void main(String[] args) {
		for (int i = 1; i < 26; i++) {
			if (i % 15 == 0) {
				System.out.print("fizz buzz");
			} else if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else {
				System.out.print(i);
			}
			System.out.print(", ");
		}

	}
}
