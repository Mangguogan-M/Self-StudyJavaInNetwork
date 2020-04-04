package day20_Exception.demo6;

public class Student {
	private String name;
	private int id;

	public Student() {
		super();
	}

	public Student(String name, int id) throws IDException {
		super();
		setName(name);
		setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws IDException {
		if (id > 0) {
			this.id = id;
		} else {
			// System.out.println("学号不合理!");
			throw new IDException("学号不合理!");
		}

		System.out.println("我是小强。。。。");

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
