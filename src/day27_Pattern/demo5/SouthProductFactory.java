package day27_Pattern.demo5;

//具体类，南方产品工厂
public class SouthProductFactory implements Factory{

	@Override
	public Fruit createFruit() {
		return new SouthFruit();
	}

	@Override
	public Vegetable createVegetable() {
		return new SouthVegetable();
	}

}
