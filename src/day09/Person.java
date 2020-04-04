package day09;

/*
 * ���ʵ��Person��ķ�װ
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
			System.out.println("���䲻����!");
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
