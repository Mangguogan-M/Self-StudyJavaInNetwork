package day22_Threadd.demo9;

/*
 * 图书类
 */
public class Book {
	private String name;
	private String rmb;
	// 如果为true说仓库有书，如果为false说仓库没有书的
	// 如果有书消费者就去消费
	// 如果没有书，那么消费者需要通知生产者去生产图书。
	boolean flag;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRmb() {
		return rmb;
	}

	public void setRmb(String rmb) {
		this.rmb = rmb;
	}

}
