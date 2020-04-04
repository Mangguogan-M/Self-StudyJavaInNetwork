package day27_Pattern.demo4;

public class TestFactory {
	public static void main(String[] args) {
		
		
		Factory f = new DogFactory(); // 先创建一个狗工厂
		Animal dog = f.createAnimal();
		dog.eat();
		
		
		Factory f2 = new CatFactory();
		Animal cat = f2.createAnimal();
		cat.eat();
		
		
	}
}
