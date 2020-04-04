package day27_Pattern.demo5;

public class TestAbstractFatory {
	public static void main(String[] args) {
		// 创建北方的工厂
		Factory northFactory = new NorthProductFactory();
		// 创建南方的产品工厂
		Factory southFactory = new SouthProductFactory();

		System.out.println("北方产品：");
		northFactory.createFruit().fruitInfo();
		northFactory.createVegetable().vegetableInfo();
		System.out.println("南方产品：");
		southFactory.createFruit().fruitInfo();
		southFactory.createVegetable().vegetableInfo();

	}
}
