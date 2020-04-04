package day11;

//矩形
public class Rect extends Shape {

	private int len;// 长度
	private int wid;// 宽度

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
