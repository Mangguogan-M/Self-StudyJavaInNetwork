package day10;

public class TestDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.show();
		System.out.println("----------------------");
		Dog dog2 = new Dog("½ðÃ«", 3);
		dog2.show2();
		dog2.eat();

	}
}
