package cat;

class Room1 {
	public int x() {

		int ax = (int) (Math.random() * 8 + 3);

		return ax;
	}

	public int y() {
		int ay = (int) (Math.random() * 8 + 3);// 3~10
		return ay;
	}
}

public class Room {
	public static void main(String[] args) {
		Room1 room1 = new Room1();
		int xa = room1.x();
		int ya = room1.y();
		
		int ran = (int) (Math.random() * 4); // 0,1,2,3
		
		int xran = (int) (Math.random() * 11);
		int yran = (int) (Math.random() * 11);
		while (true) {
			if (ran == 0) {
				if (yran < ya && yran != 0) {
					xran = 0;
					break;
				} else {
					yran = (int) (Math.random() * 11);
				}
			} else if (ran == 1) {
				if (yran < ya && yran != 0) {
					xran = xa;
					break;
				} else {
					yran = (int) (Math.random() * 11);
				}
			} else if (ran == 2) {
				if (xran < xa && xran != 0) {
					yran = 0;
					break;
				} else {
					xran = (int) (Math.random() * 11);
				}
			} else if (ran == 3) {
				if (xran < xa && xran != 0) {
					yran = ya;
					break;
				} else {
					xran = (int) (Math.random() * 11);

				}
			}
		}

		for (int i = 0; i < xa + 1; i++) {
			for (int j = 0; j < ya + 1; j++) {

				if (i == 0 || i == xa || j == 0 || j == ya) {
					if (i == xran && j == yran) {
						System.out.print("□");
					} else {
						System.out.print("■");
					}
				} else {
					System.out.print("□");
				}

			}
			System.out.println("");
		}

	}
}
