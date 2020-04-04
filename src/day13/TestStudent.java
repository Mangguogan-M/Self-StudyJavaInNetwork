package day13;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(1001, "zhangfei");
		Student s2 = new Student(1001, "zhangfei");

		System.out.println(s1 + "  " + s2);
		// 调用equals方法来判断两个对象是否相等，这里默认从Object类中继承下来的

		// 该方法默认比较对象的地址
		// 当重写equals方法后，则调用子类重写以后的版本，比较内容
		boolean b1 = s1.equals(s2);
		System.out.println("b1 = " + b1);// b1 = false
		System.out.println(s1 == s2);// false

		// ----------------------

		// String类重写equals方法 所有比较的是字面量
		System.out.println("你好".equals("你好"));// true

		System.out.println("------------------------");

		// 调用从Object类中继承的hashCode方法来获取对应的哈希码
		// 当Student类中重写hashCode方法后，则调用重写以后的版本
		int res = s1.hashCode();
		System.out.println("res =" + res);
		res = s2.hashCode();
		System.out.println("res =" + res);

		System.out.println("-----------------------");
		String str1 = s1.toString();
		System.out.println(str1);
		System.out.println(s1);// 默认调用toString()方法

		String str3 = "hello";
		str3 = str3 + s1;// 调用toString()方法
		System.out.println(str3);// 因为String从写了toString方法并且还重写了equals方法

	}
}
