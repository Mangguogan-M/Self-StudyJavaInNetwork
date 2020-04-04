package day11;

//自定义Person类并做封装
public class Person {

	private String name;// 姓名
	private int age;// 年龄

	// alt+s 生成get、set方法以及有参无参构造等.....
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("年龄不合理！");
		}

	}

	public void show() {
		System.out.println("我是" + getName() + ",今年" + getAge() + "岁了!");
	}

	public static void test() {
		System.out.println("Person类的静态方法");
	}

}
