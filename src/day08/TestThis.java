package day08;

/*
 * 编程来进行观察this关键字
 */
public class TestThis {

	String name;

	int age;

	TestThis() {
		// 在构造方法中this代表当前正在构建的对象
		System.out.println("无参构造中" + this);

	}

	TestThis(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		// 在成员方法中this代码当前正在调用的对象
		System.out.println("show方法中" + this);
	}

	void show2() {
		System.out.println(name + "  " + age);
	}

	public static void main(String[] args) {
		TestThis tt = new TestThis();
		tt.show();
		System.out.println(tt);

		System.out.println("--------------------");
		TestThis tt2 = new TestThis("王健林", 18);
		tt2.show2();

	}

}
