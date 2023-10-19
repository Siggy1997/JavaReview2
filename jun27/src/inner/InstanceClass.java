package inner;

//인스턴스 멤버 클래스
/*
 * static 키워드 없이 중첩 선언된 클래스
 * 인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언 가능
 * 	-> 정적 필드와 정적 메소드는 선언 불가.
 * 
 */

class IA {
	// 멤버 필드
	int num;

	class IB {// 인스턴스 멤버 클래스
		public IB() {
		} // 생성자 선언 가능

		int number; // 인스턴스 필드
		// static int num; // 선언하지마세요 //객체 생성하고 사용

		static void method1() {}// 선언하지마세요
		void method2() {
		}
	}// class IB 종료
		// =---------------------------------------------------

	void methodA() {
		IB ib = new IB();
		ib.number = 0;
		ib.method2();
		
		//IA.IB.method1(); //쓰지말아라
		
	}

	static void methodB() {
		IA ia = new IA();
		IA.IB ib = ia.new IB();
		ib.number = 10;
		IA.IB.method1();
	}

}

public class InstanceClass {
	public static void main(String[] args) {
		//class IB에 static이 없어서 IA-> IB로 들어가야됨
		IA ia = new IA();
		IA.IB ib = ia.new IB();
		ib.number = 100;
		ib.method2();

	}
}
