package inner;

class HA {
	public void method() {
		System.out.println("AA's method()");
	}
}

class HB extends HA {
	@Override
	public void method() {
		System.out.println("자식에서 재정의");
	}
}

public class AnonymousClass01_01 {
	public static void main(String[] args) {

		HA aa = new HB();
		aa.method();
		
		HA a2 = new HB() {
			@Override
			public void method() {
				System.out.println("익명 형태로 제작되었습니다.");
			}
		};
		a2.method();
	
	
	}

}
