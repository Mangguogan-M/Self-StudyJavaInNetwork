package day27_Pattern.demo4;

//具体的狗工厂类
public class DogFactory implements Factory {
	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
