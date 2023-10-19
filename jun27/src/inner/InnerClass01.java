package inner;

//중첩 클래스 
//클래스 속 클래스 406페이지 
//2023-06-27
// $1 & $
class A { //A.class
	// 멤버 필드
	class B{} //인스턴스 멤버 클래스 //A$B
	
	static class C{} // 정적 멤버 클래스 //A$C
	//static 은 new X class에 따라 다님
	
	
	public void me1() {
		class B{} //로컬 클래스 //A$1B
	}
	
	public void me2() {
		class B{} //A$2B
	}
}

public class InnerClass01 {
	public static void main(String[] args) {
		
	}
}
