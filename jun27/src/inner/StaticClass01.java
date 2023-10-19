package inner;

//정적 멤버 클래스
/*
 * static 키워드로 선언된 클래스
 * 
 */
//비교를 위해서 만듬

class SA {
	static class SB {
		public SB() {
		}

		int num;
		static int number;

		void me() {
		}

		static void me2() {
		}

	}
}

public class StaticClass01 {
	public static void main(String[] args) {
		// instance class는 static class가 없었음
		SA.SB sb = new SA.SB();
		sb.num = 100;

		SA.SB.number = 100;
		SA.SB.me2();
		

	}
}
