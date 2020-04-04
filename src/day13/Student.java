package day13;

//Student类封装
public class Student {

	private int id;
	private String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("学号不合理！！");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 1.若两个对象的地址一样，则内容一定相同
		if (this == obj) {
			return true;
		}

		// 2.若调用对象不为空,参数对象为空，则内容一定不相同
		else if (obj == null) {
			return false;
		}
		// 3.若参数对象和调用对象类型一致，则由学号来决定两个对象内容是否相同
		else if (obj instanceof Student) {

			Student s = (Student) obj;

			if (this.getId() == s.getId()) {
				return true;
			} else {
				return false;
			}

		}
		// 4.若参数对象和调用对象的类型不一致，则内容一定不相同
		else {
			return false;
		}
	}

	@Override // 为了保证和equals方法结果一致性，需要重写hashCode方法
	public int hashCode() {
		// return getId();
		int type = 12;
		return type * 31 + getId();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// 为了打印对象中的成员变量值，则需要重写toString()方法
	/*
	 * @Override public String toString(){ return "学号="+getId()+",姓名="+getName(); }
	 */

}
