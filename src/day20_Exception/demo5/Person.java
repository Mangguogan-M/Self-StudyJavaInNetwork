package day20_Exception.demo5;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) throws Exception {
		super();
		setName(name);
		setAge(age);
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

	public void setAge(int age) throws Exception {
		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			// System.out.println("年龄不合理！");
			// 手动产生一个异常对象并抛出
			// throw new Exception();
			throw new AgeException("年龄不合理!");
		}

		System.out.println("让大家观察一下产生异常的效果");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
