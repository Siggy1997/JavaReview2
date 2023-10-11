package jun07;
/*
 * 이름 만드는 방법 : class, method, var, data type
 * P 타입 R타입 구분 = 대문자 : R타빙   소문자 : P타입
 */
public class Test02 {
	
	//메소드 속에 메소드가 들어갈까요? 
	// 불가능, 호출은 가능
	


	public static void main(String[] args) {
		int i = 100;
		String str = new String ("R"); //인스턴스 만들기

		
		//AppleKorea 클래스 불러오기
		AppleKorea appleKorea = new AppleKorea();
		appleKorea.apple();

		
	}
}
class AppleKorea{
	public void apple() {
			System.out.println("사과입니다");
	}
}

