package day11;

//т╡пн
public class Circle extends Shape {

	private int r;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		setR(r);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void show() {
		super.show();

		System.out.println("r = " + getR());

	}

}
