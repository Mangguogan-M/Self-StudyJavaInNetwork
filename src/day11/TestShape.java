package day11;

/*
 * 案例：
		形状：横坐标、纵坐标
		矩形：长度、宽度
		圆形：半径

		写一个方法要求既能打印矩形又能打印圆形。
 */
public class TestShape {

	// 自定义成员方法来打印参数指定矩形的成员变量值
	// Rect r = new Rect(1, 2, 3, 4);
	/*
	 * public static void draw(Rect r){
	 * 
	 * //调用Rect类型自己的show()方法 r.show(); }
	 */

	// 自定义成员方法打印参数指定的圆形的成员变量值
	/*
	 * public static void draw2(Circle c){ //调用Circle类自己的show()方法 c.show(); }
	 */

	// 当形参类型为Shape时，即可以接收矩形的对象，同时又可以接收圆形的对象。
	public static void draw(Shape s) {
		// 在编译阶段调用Shape类的show()方法，在运行阶段调用子类重写的show()方法
		// 虽然看似调用同一个show()方法，但是根据实参的不同最终调用不同的版本
		// 带来不同的结果
		s.show();
	}

	public static void main(String[] args) {
		// 矩形
		Rect r = new Rect(1, 2, 3, 4);
		TestShape.draw(r);
		// TestShape.draw(r);
		System.out.println("------------------------");
		// 圆形
		Circle c = new Circle(5, 6, 7);
		// TestShape.draw2(c);
		TestShape.draw(c);

	}
}
