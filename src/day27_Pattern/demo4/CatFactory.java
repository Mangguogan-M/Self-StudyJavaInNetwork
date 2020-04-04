package day27_Pattern.demo4;

//具体的猫工厂类
public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
