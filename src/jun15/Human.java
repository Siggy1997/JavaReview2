package jun15;

import java.util.Arrays;

import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

//프로그램 로직에 필요한것과 필요없는거 생각하기

public class Human {
	// 필드
	// 사람에게 필요한 정보 -> 필요한 정보만 남기고 필요없는거 뺴버림
	String name;
	int age;
	int num;

	// 생성자
	// 메소드
	public void myInfo() {

		System.out.println("내 이름은 " + name + "입니다");
		System.out.println("내 나이는 " + age + "살 입니다");

	}

	public static void main(String[] args) {
		Human h = new Human(); // 생성자
		System.out.println("h : " + h); // jun15.Human@3d012ddd

		Human[] man = new Human[3];
		man[0] = h;
		man[1] = new Human();
		System.out.println("array : " + man); // [Ljun15.Human;@626b2d4a
		System.out.println("array[0] : " + man[0]); // jun15.Human@3d012ddd
		System.out.println("array[1] : " + man[1]); // jun15.Human@5e91993f
		System.out.println("array[2] : " + man[2]); // null

		man[2] = new Human();

		h.name = "홍길동";
		man[1] = man[0]; // 메모리에서 [1]이 소거됩니다 . GC=메모리 자동관리

		System.out.println(man[0].name);
		System.out.println(man[1].name);
		System.out.println(man[2].name);

		System.out.println(h == man[1]); // R type에서는 객체 비교

		System.out.println(h.equals(man[1]));

		man[1] = new Human();
		System.out.println("array[1] : " + man[1]);

		Human h2 = man[0];
		Object[] arr01 = new Object[3];
		arr01[0] = h;
		arr01[1] = 1000;
		arr01[2] = "이것도 됩니다";

		int number = (int) arr01[1];
		System.out.println(number);

		String srt = (String) arr01[2];
		System.out.println(srt);

		System.out.println(Arrays.toString(arr01));

		Human h3 = (Human) arr01[0];

		// 다른 페키지에 있는 클래스 호출
		// public이 없을 경우 import가 불가능

		Cat tom = new Cat();
		tom.name = "톰";

		Dog dog = new Dog();
		dog.name = "썬더";

	}
}
