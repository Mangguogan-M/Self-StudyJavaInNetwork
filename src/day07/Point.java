package day07;

/*
 * 编程实现Point类的定义
 */
public class Point {

	int x;// 用于描述横坐标的成员变量
	int y;// 用于描述纵坐标的成员变量

	// 自定义成员方法打印横纵坐标的数值
	void show() {
		System.out.println("(" + x + "  ,  " + y + ")");
	}

	// 自定义成员方法让横纵坐标加上参数指定的数值覆盖横坐标
	void right(int i) {
		x = x + i;
	}

	public static void main(String[] args) {

		// 表示使用Point类型的引用指向Point类型的对象
		Point p = new Point();
		// 调用成员方法进行测试
		p.show();

		p.right(10);

		p.show();
	}

}
