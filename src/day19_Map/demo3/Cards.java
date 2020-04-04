package day19_Map.demo3;

public class Cards implements Comparable<Cards> {
	private String color;// 颜色
	private String number;// 号码
	private int sort;// 排序

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Cards(String color, String number, int sort) {
		super();
		this.color = color;
		this.number = number;
		this.sort = sort;
	}

	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return color + number;
	}

	@Override
	public int compareTo(Cards o) {
		// TODO Auto-generated method stub
		return this.sort - o.sort;
	}

}
