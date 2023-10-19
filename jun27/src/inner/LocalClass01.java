package inner;

//Local Class
/*
 * 중첩 클래스는 메소드 내에서도 선언할 수 있습니다.
 *  	= 로컬 클래스
 *  로컬클래스는 접근 제어자 및 static을 붙일 수 없습니다.
 *  로컬 클래스는 메소드 내부에서만 사용되므로 접근 제어자가 필요 없습니다.
 *  로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언 가능하고 
 *  정적 필드와 메소드는 선언할 수 없습니다.
 *  
 *  
 */
//class -> method-> class
class LA{
	void method() { //메소드 속
		
		class LB{ //로컬 클래스
			
			public LB() {
				System.out.println("LB가 만들어졌습니다");
			}
			
			int num;
			
			void method() {
				System.out.println("hello");
			}
			
			static int number; //X
			
			static void method2() {} //X
			
		}//LB클래스 끝
		
		LB lb = new LB();
		lb.num = 100;
		lb.method(); //메소드 속으로 들어갈수 없어서 만들어줌
		LB.method2();
	}
}
public class LocalClass01 {
	public static void main(String[] args) {
		LA la = new LA();
		la.method();
		
	
	}
}
