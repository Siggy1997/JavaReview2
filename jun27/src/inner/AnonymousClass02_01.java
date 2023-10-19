package inner;

abstract class Z {
	abstract public void cry();

	abstract public void cryy();
}

class F extends Z {

	@Override
	public void cry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cryy() {
		// TODO Auto-generated method stub

	}

}


public class AnonymousClass02_01 {

	public static void main(String[] args) {
		Z z = new Z() {

			@Override
			public void cry() {
				System.out.println("hi");
			}

			@Override
			public void cryy() {
				// TODO Auto-generated method stub

			}

		};
		z.cry();
		
		F f = new F() {
			
		};

	}

}
