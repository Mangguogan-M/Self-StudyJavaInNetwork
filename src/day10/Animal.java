package day10;

/*
 * 
 * 动物：
 * 		特征：姓名、年龄
 * 		行为：吃
 * 
 * 小猫
 * 		特征：姓名、年龄
 * 		行为：吃
 * 小狗
 * 		特征：姓名、年龄
 * 		行为：吃
 * 老虎
 * 		特征：姓名、年龄
 * 		行为：吃
 * 狮子
 * 		特征：姓名、年龄
 * 		行为：吃
 */
public class Animal {

	private String name;
	private int age;

	public Animal() {

	}

	public Animal(String name, int age) {
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

	public void eat() {

	}

	public void show() {
		System.out.println(this.name + " " + this.age);
	}

}
