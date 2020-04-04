package day09;

/*
 * 测试类
 */
public class TestGirl {

	public static void main(String[] args) {

		Girl g = new Girl();
		g.show();// null 0 还没有男朋友!

		// 使用有参构造得方式创建
		Girl g1 = new Girl("凤姐", -18, true);
		g1.show();// 凤姐 -18 true
		g1.grow();
		g1.show();
		g1.grow(10);
		g1.show();

	}

}
