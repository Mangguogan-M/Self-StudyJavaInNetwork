package day08;

/*
 * 定义Person 类
 */
public class Person {
	// 成员变量
	String name;
	int age;

	// 自定义无参的构造
	Person() {
		System.out.println("我就是一个无参构造方法，不服来战.");
		name = "张三";
		age = 18;
	}

	// 自定义有参的构造方法，能够接收姓名和年龄作为参数
	Person(String n, int a) {
		name = n;
		age = a;
	}

	// 自定义成员方法实现姓名和年龄的打印
	void show() {
		System.out.println("我是" + name + ",今年" + age + "岁了.");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.show();
		System.out.println("-----------------");
		// 表示又创建了一个对象，并将地址记录到p2中
		Person p2 = new Person("张飞", 20);
		p2.show();
	}
}
