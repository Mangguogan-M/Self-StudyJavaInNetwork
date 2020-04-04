package day27_Pattern.demo2;

public class TestICloneable {
	/*
	 * 这边指向同一个地址，一个更改全部更改。不是原型模式，只是简单的复制。
	 */
	public static void main(String[] args) {

		System.out.println("-------------原型简历模板-------------");
		// 原型简历
		ICloneable clone = new ICloneable();
		// 设置手机号
		Number number = new Number();
		number.setPhone("13717796999");
		// 设置个人信息
		clone.setInfo("张三", 17, number);
		// 设置工作经验
		clone.setWeek("京东", "东京");
		clone.show();

		// 复制简历
		System.out.println("------------克隆一号------------");
		ICloneable clone2 = clone;
		Number number2 = clone2.getNumber();
		number2.setPhone("123123");
		clone2.setInfo("李四", 18, number2);

		clone2.show();

		System.out.println("------------克隆二号------------");
		ICloneable clone3 = clone;
		clone3.show();

		System.out.println("------------打印测试-----------");
		clone.show();
		clone2.show();
		clone3.show();
	}
}
