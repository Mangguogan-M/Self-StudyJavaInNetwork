package day13;

//Student���װ
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
			System.out.println("ѧ�Ų�������");
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
		// 1.����������ĵ�ַһ����������һ����ͬ
		if (this == obj) {
			return true;
		}

		// 2.�����ö���Ϊ��,��������Ϊ�գ�������һ������ͬ
		else if (obj == null) {
			return false;
		}
		// 3.����������͵��ö�������һ�£�����ѧ���������������������Ƿ���ͬ
		else if (obj instanceof Student) {

			Student s = (Student) obj;

			if (this.getId() == s.getId()) {
				return true;
			} else {
				return false;
			}

		}
		// 4.����������͵��ö�������Ͳ�һ�£�������һ������ͬ
		else {
			return false;
		}
	}

	@Override // Ϊ�˱�֤��equals�������һ���ԣ���Ҫ��дhashCode����
	public int hashCode() {
		// return getId();
		int type = 12;
		return type * 31 + getId();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// Ϊ�˴�ӡ�����еĳ�Ա����ֵ������Ҫ��дtoString()����
	/*
	 * @Override public String toString(){ return "ѧ��="+getId()+",����="+getName(); }
	 */

}
