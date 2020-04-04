package day11;

//自定义Student类实现封装    Student继承自Person类型，是Person类的子类
public class Student extends Person {
	private int id;// 学号

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		setId(id);
	}

	public Student(int id) {
		super();
		this.id = id;
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

	@Override
	public void show() {
		super.show();
		System.out.println("学号：" + getId());
	}

	// @Override 静态方法不能重写
	public static void test() {
		System.out.println("Student类型的静态方法");
	}

}
