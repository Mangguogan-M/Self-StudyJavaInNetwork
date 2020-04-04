package day27_Pattern.demo3;

public class TestFactory {
	public static void main(String[] args) {

		// Dog dog = AnimalFactory.getDog();
		// dog.eat();
		// Cat cat = AnimalFactory.getCat();
		// cat.eat();
		// Dog dog2 = AnimalFactory.getDog();
		// System.out.println(dog2);
		// System.out.println(dog);
		// System.out.println(cat);
		// ----------------------
		Animal dog = AnimalFactory.getAnimal("dog");
		dog.eat();

		Animal cat = AnimalFactory.getAnimal("cat");
		cat.eat();

	}
}
