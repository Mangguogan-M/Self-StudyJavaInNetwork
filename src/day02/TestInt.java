package day02;

public class TestInt {

	public static void main(String[] args) {

		// 声明int类型变量 int类型的范围 正负21亿
		// int ia = 2200000000;//错误: 过大的整数: 2200000000 超出整数范围
		int ia = 2100000000;
		System.out.println(ia);

		// 声明byte类型变量 byte类型的范围 -128~127
		// byte b1 = 129; // 错误: 不兼容的类型: 从int转换到byte可能会有损失
		byte b1 = 127;
		System.out.println(b1);
		// 声明short类型的变量 short类型的范围 -32768~32767
		short s1 = 32767;

		System.out.println(s1);
		// 声明long类型的变量 long 类型 比int类型还要大 后面跟上小l或者大L来区分。
		long l1 = 210000000000l;
		System.out.println(l1);

	}

}