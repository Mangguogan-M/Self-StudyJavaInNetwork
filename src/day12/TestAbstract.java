package day12;

public abstract class TestAbstract {

	private int num;

	public TestAbstract(int num) {
		super();
		this.num = num;
	}

	public TestAbstract() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// 自定义抽象方法
	public abstract void show();

	/*
	 * public void show(){ System.out.println("show方法"); }
	 */

	public static void main(String[] args) {
		// TestAbstract t = new TestAbstract();
		// t.show();
	}
}
