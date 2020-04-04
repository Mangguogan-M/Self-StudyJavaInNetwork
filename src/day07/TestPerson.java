package day07;

public class TestPerson {
	public static void main(String[] args) {

		// 创建Person对象
		// 左边的引用 用于记录右边地址
		Person p = new Person();
		// 通过 引用名称.成员变量名

		p.name = "张三";
		p.age = 18;

		System.out.println(p.name + "   " + p.age);

		// 成员方法的调用 引用名称.成员方法
		p.show();

	}
}
