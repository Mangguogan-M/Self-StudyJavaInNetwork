package day11;

//����
public class Rect extends Shape {

	private int len;// ����
	private int wid;// ���

	public Rect() {
		super();
	}

	public Rect(int len, int wid, int x, int y) {
		super(x, y);
		this.len = len;
		this.wid = wid;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("len =" + getLen() + ",wid = " + getWid());
	}

}
