package zoo;
//개 고양이 쥐 말 등등등
class Ancestor{ //개 고양이 말 쥐 의 선조
	void sleep() {
		System.out.println("Zzzz...");
	}
}


class Horse extends Ancestor{
	String name;
	int age;

}
class Mouse extends Ancestor{
	String name;
	int age;

}

public class Animal extends Ancestor{
	public static void main(String[] args) {
		Ancestor[] ani = new Ancestor[4];
		
		//Dog dog = new Dog();
		//Cat cat = new Cat();
		//cat.sleep();
		//Mouse mouse = new Mouse();
		//Horse horse = new Horse();
		//ani[] = {dog, cat, mouse, horse};
		
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		ani[2] = new Mouse();
		ani[3] = new Horse();
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].sleep();
		}

	}
}
