package day09;

/*
 * 编程实现Person类的封装
 */
public class Person {
	private int age;
	private String name;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			System.out.println("年龄不合理!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(name + " " + age);
	}

}
