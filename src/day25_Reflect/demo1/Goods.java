package day25_Reflect.demo1;

/*
 * ��Ʒ��
 */
public class Goods {
	private String name;// ��Ʒ����
	private Double price;// ��Ʒ�ļ۸�
	private Integer storage;// ���

	public Goods() {
		System.out.println("���е��޲ι���");
	}

	private Goods(String name, Integer storage) {
		this.name = name;
		this.storage = storage;
		System.out.println("˽�е��вι���");
	}

	public Goods(String name, Double price, Integer storage) {
		super();
		this.name = name;
		this.price = price;
		this.storage = storage;
		System.out.println("���е��вι���");
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
