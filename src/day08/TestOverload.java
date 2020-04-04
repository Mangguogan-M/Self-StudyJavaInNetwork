package day08;

/*
 * 编程实现方法重载
 */
public class TestOverload {

	void show() {
		System.out.println("show()");
	}

	// 方法的重载，体现在参数的个数不同
	void show(int i) {
		System.out.println("show(int)");
	}

	// 方法的重载，体现在参数的类型不同
	void show(double d) {
		System.out.println("show(double)");
	}

	// 能否构成重载的本质：调用是能否区分，与形参变量名没有关系
	/*
	 * void show(double e){ System.out.println("show(double)"); }
	 */
	// 方法的重载与方法的返回值类型无关
	/*
	 * int show(double e){ System.out.println("show(double)"); return 1; }
	 */

	void show(int i, double d) {
		System.out.println("show(int,double)");
	}

	void show(double d, int i) {
		System.out.println("show(double,int)");
	}

	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.show();
		to.show(0.0);
		to.show(10);
		to.show(1, 0.0);
		to.show(0.5, 2);
	}

}
