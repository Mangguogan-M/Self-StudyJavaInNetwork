package day07;

/*
 * 商品类
 */
public class Goods {

	// 属性/成员变量如下：
	String name;// 商品名称
	double price;// 商品价格
	int number;// 商品数量
	String tname;// 商品的类型

	// 成员方法，返回商品名称
	String getName() {
		return "娃娃";
	}

	double getPrice() {
		return 399.0;
	}

	int getNumber() {
		return 10;
	}

	// 定义一个成员方法 名称为show 显示用户传入的参数
	void show(String name, double price) {
		System.out.println("传入的参数是：" + name + "  " + price);

	}

}
