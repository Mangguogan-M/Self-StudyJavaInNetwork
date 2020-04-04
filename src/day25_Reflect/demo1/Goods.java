package day25_Reflect.demo1;

/*
 * 商品类
 */
public class Goods {
	private String name;// 商品名称
	private Double price;// 商品的价格
	private Integer storage;// 库存

	public Goods() {
		System.out.println("共有的无参构造");
	}

	private Goods(String name, Integer storage) {
		this.name = name;
		this.storage = storage;
		System.out.println("私有的有参构造");
	}

	public Goods(String name, Double price, Integer storage) {
		super();
		this.name = name;
		this.price = price;
		this.storage = storage;
		System.out.println("共有的有参构造");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

}
