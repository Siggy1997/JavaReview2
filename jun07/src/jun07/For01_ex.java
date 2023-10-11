package jun07;

public class For01_ex {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
			}
			for (int k = 0; k <= i * 2; k++) {

				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 1; i < 10; i++) {
			if (i % 3 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");

	}
}

