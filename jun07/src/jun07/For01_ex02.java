package jun07;

public class For01_ex02 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 2; j >= i; j--) {
					System.out.print("_");
				}
			}
			if (i < 3) {
				for (int j = 0; j <= i * 2; j++) {
					System.out.print("*");
				}
			}
			if (i >= 3) {
				for (int j = 2; j <= i; j++) {
					System.out.print("_");
				}
			}
			if (i >= 3) {
				for (int j = 9; j > i * 2; j--) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
