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

	// �Զ�����󷽷�
	public abstract void show();

	/*
	 * public void show(){ System.out.println("show����"); }
	 */

	public static void main(String[] args) {
		// TestAbstract t = new TestAbstract();
		// t.show();
	}
}
