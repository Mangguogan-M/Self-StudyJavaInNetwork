package day12;

public class TestGold {
	public static void main(String[] args) {

		// 接口类型的引用指向了实现类的对象，形成了多态
		Money mn = new Gold();
		mn.buy();

		Metal m = new Gold();
		m.shine();

	}
}
