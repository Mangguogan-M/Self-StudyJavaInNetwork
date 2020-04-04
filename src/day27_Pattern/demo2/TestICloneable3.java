package day27_Pattern.demo2;

/*
 * 深克隆，深复制
 * 		深克隆就是复制了基本数据类型又复制引用类型
 */
public class TestICloneable3 {
	public static void main(String[] args) throws Exception {
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
		ICloneable clone2 = (ICloneable) clone.deepClone();
		Number number2 = clone2.getNumber();
		number2.setPhone("123123");
		clone2.setInfo("李四", 18, number2);
		clone2.show();

		System.out.println("------------克隆二号------------");
		ICloneable clone3 = (ICloneable) clone.deepClone();
		Number number3 = clone3.getNumber();
		number3.setPhone("110110");
		clone3.setInfo("小红", 11, number3);
		clone3.setWeek("百度", "北京西二旗");

		clone3.show();

		System.out.println("------------打印测试-----------");
		clone.show();
		clone2.show();
		clone3.show();
	}
}
