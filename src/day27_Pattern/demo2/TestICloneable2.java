package day27_Pattern.demo2;

public class TestICloneable2 {
	/*
	 * 浅克隆，浅复制 只复制基本数据类型，引用数据类型没有复制，引用数据类型还指向同一个对象。
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

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
		ICloneable clone2 = (ICloneable) clone.clone();
		Number number2 = clone2.getNumber();
		number2.setPhone("123123");
		clone2.setInfo("李四", 18, number2);

		clone2.show();

		System.out.println("------------克隆二号------------");
		ICloneable clone3 = (ICloneable) clone.clone();
		clone3.show();

		System.out.println("------------打印测试-----------");
		clone.show();
		clone2.show();
		clone3.show();
	}
}
