package day11;

//��״��
public class Shape {
	private int x;
	private int y;

	public Shape() {
		super();
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// ��ӡ����
	public void show() {
		System.out.println("( " + getX() + " , " + getY() + ")");
	}

}
