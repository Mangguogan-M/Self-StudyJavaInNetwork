package day07;

public class TestGoods {
	public static void main(String[] args) {

		// 创建商品类的对象
		Goods goods = new Goods();

		System.out.println("商品名称：" + goods.getName());
		System.out.println("商品价格：" + goods.getPrice());
		System.out.println("商品数量：" + goods.getNumber());

		goods.show("九阳神功", 999);

	}
}
