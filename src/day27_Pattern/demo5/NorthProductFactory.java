package day27_Pattern.demo5;

/*
 * 具体类，北方产品工厂
 */
public class NorthProductFactory implements Factory {

	@Override
	public Fruit createFruit() {
		return new NorthFruit();
	}

	@Override
	public Vegetable createVegetable() {
		return new NorthVegetable();
	}

}
