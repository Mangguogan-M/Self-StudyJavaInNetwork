package day27_Pattern.demo2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 简历实体
 */
public class ICloneable implements Cloneable, Serializable {

	private static final long serialVersionUID = 2269323637457452994L;
	private String name;// 姓名
	private int age;// 年龄
	private String last;// 上一家公司
	private String address;// 公司地址
	private Number number;// 电话

	/*
	 * 个人信息
	 */
	public void setInfo(String name, int age, Number number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

	/*
	 * 工作经验
	 */
	public void setWeek(String last, String address) {
		this.last = last;
		this.address = address;
	}

	/*
	 * 查看简历
	 */
	public void show() {
		System.out.println("姓名：" + name + ",年龄:" + age + ",联系电话:" + number.getPhone() + "");
		System.out.println("公司名称:" + last + ",公司地址:" + address);
	}

	/*
	 * 浅复制
	 * 
	 * 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原来对象所指向的
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/*
	 * 深克隆 将对象重新组装，组成新的对象
	 * 
	 * 利用序列化
	 * 
	 * 将一个对象复制后，基本数据类型和引用类型重回重新创建
	 * 
	 * java.io.NotSerializableException: demo2.ICloneable 这边可能会出现没有序列化异常
	 */
	public Object deepClone() throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		// 将当前对象序列化
		oos.writeObject(this);

		byte[] bs = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bs);
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ICloneable [name=" + name + ", age=" + age + ", last=" + last + ", address=" + address + ", number="
				+ number + "]";
	}

}
