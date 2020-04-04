package day21_FileAndIO.IO.demo8;

import java.io.Serializable;

/*
 * 商品实体
 */
public class Goods implements Serializable {

	private static final long serialVersionUID = -1660389414138453361L;

	private Integer id;
	private String name;
	private Double price;
	// transient 被他修饰的成员变量不参与序列化
	private transient Integer storage;

	public Goods() {
		super();
	}

	public Goods(Integer id, String name, Double price, Integer storage) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storage = storage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", storage=" + storage + "]";
	}

}
