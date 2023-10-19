package inner;
//다른 모습
//june 21 interface
interface AC{
	public void print();
	public void method2();
}

class AD implements AC{

	@Override
	public void print() {
		
	}

	@Override
	public void method2() {
		
	}
	
}
public class AnonymousClass02 {
	public static void main(String[] args) {
		AD ad = new AD();
		ad.print();
		
		AC ac = new AC() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
			
		};
		ac.print();
		ac.method2();
		
	}
}
