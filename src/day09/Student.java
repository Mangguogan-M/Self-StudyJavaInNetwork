package day09;

//编程实现Student类的封装并继承Person 类
public class Student extends Person {

	private int id;

	public Student() {
		super();// 表示调用父类的无参构造方法，编译器会自动添加
	}

	public Student(String name, int age, int id) {
		super(name, age);// 表示调用父类中有参构造方法
		/*
		 * setAge(age); setName(name);
		 */
		setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 标注：用于明确告诉编译器下面的方法是对父类中方法的重写，若没有构成重写则错误
	@Override
	public void show() {
		// 调用父类中的show() 方法就可以打印姓名和年龄了
		super.show();
		System.out.println("学号是:" + getId());
	}

}
