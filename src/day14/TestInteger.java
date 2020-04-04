package day14;

//演示Integer类的使用
public class TestInteger {
	public static void main(String[] args) {
		// 使用Integer类中的构造方法来构造对象，该类没有无参构造方法
		Integer it = new Integer(123);
		// 自动调用toString()方法，得到字符串类型的十进制整数。
		System.out.println(it);

		Integer it2 = new Integer("456");
		System.out.println(it2);
		System.out.println("----------------------");
		// 实现int类型和Integer类型之间的相互转换
		Integer it3 = Integer.valueOf(789);
		System.out.println(it3);// 789 String类型的

		int res = it3.intValue();
		System.out.println(res);// 789 int类型的

		System.out.println("----------------------");
		// 实现String类型向int类型的转换
		res = Integer.parseInt("12345");
		System.out.println(res);

		// java.lang.NumberFormatException
		// 要求字符串中的每个字符都是十进制整数的字符，否则产生数字格式异常
		// res = Integer.parseInt("12345a");
		System.out.println(res);

		System.out.println("-----------------------");
		// 自动装箱和自动拆箱的机制
		Integer it4 = 100; // int => Integer 发生自动装箱，自动调用valueOf()
		res = it4; // Integer => int 发生自动拆箱，自动调用intValue()方法
		System.out.println("-----------------------");
		/*
		 * Integer it5 = 128; Integer it6 = 128; Integer it7 = new Integer(128); Integer
		 * it8 = new Integer(128);
		 * 
		 * System.out.println(it5.equals(it6));//true 比较内容 System.out.println(it5 ==
		 * it6);//false 比较地址 System.out.println(it7.equals(it8));//true
		 * System.out.println(it7 == it8);//false
		 */

		Integer it5 = 127;
		Integer it6 = 127;
		Integer it7 = new Integer(127);
		Integer it8 = new Integer(127);

		System.out.println(it5.equals(it6));// true 比较内容
		System.out.println(it5 == it6);// false 比较地址
		System.out.println(it7.equals(it8));// true
		System.out.println(it7 == it8);// false
	}
}
