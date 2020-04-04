package day02;

/*
	编程实现对整数类型的使用	byte、short、int、long
	实现自动类型转换和强制类型转换
*/

public class TestInt2 {

	public static void main(String[] args) {

		// 声明一个byte类型的变量，名字为b1 初始值为10
		byte b1 = 10;

		short s1 = 20;

		System.out.println("b1= " + b1);// b1 = 10
		System.out.println("s1= " + s1);// s1 = 20

		System.out.println("------------------------");
		// 测试自动类型转换,从小范围向大范围转换

		// = 赋值 等号右边的数据赋值给等号左边的数据
		// b1是byte类型 1字节 s1 short类型 占2字节 byte=>short
		s1 = b1;// 编译没问题

		System.out.println("b1= " + b1);// b1 = 10
		System.out.println("s1= " + s1);// s1 = 10

		System.out.println("------------------------");
		// 测试强制类型转换 从大范围向小范围转换

		// 将s1 赋值给b1 s1是short 2个字节 b1 byte类型 1个字节 short=>byte

		// 编译不通过
		// b1 = s1;// 错误: 不兼容的类型: 从short转换到byte可能会有损失精度

		/*
		 * 0000 0000 1000 0000 16位2进制位 表示128 short 1000 0000 byte -128
		 */
		s1 = 128;

		b1 = (byte) s1; // 将16位2进制位 转换成 8位2进制

		System.out.println(b1);

		System.out.println("------------------------");
		byte b2 = 10;// 直接两默认是int类型

		int i1 = 10;

		// b2 = i1;//编译器不通过，可能存在损失精度 i1是个变量 数值随时都可能发生改变
		b2 = (byte) i1;// 编译器通过

		System.out.println(b2);

		System.out.println("------------------------");

		// 笔试题：
		byte b23 = 10;
		int i13 = 10;
		// b23 = i13;//Java语言是一门安全性比较高的语言

	}

}