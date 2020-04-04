package day27_Pattern.demo3;

/*
 * 一个具体的工厂类可以创建多个具体的产品类
 */
public class AnimalFactory {

	// //生成狗对象
	// public static Dog getDog(){
	// return new Dog();
	// }
	//
	// //生产猫方法
	// public static Cat getCat(){
	// return new Cat();
	// }

	public static Animal getAnimal(String name) {

		if ("dog".equals(name)) {
			return new Dog();
		} else if ("cat".equals(name)) {
			return new Cat();
		}
		return null;

	}
}
