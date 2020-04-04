package day04;

/*
 * 编程实现赋值运算符的使用
 * 	  =、 +=、-=、*=、/=、%=
 */
public class TestAssign {
	public static void main(String[] args) {
		// 简单运算符 =

		int ia = 3;
		int ib = 6;
		// 将=号左边的值赋值给右边的变量，覆盖原有的数据
		ib = ia;

		System.out.println(ib);// 3

		System.out.println("---------------------");

		ib += ia;// ib=ib+ia;
		System.out.println(ib);// 6

		System.out.println("---------------------");
		// 笔试题
		byte b1 = 5;
		b1 += 3;// ok 自动类型转换
		// 3默认int类型 b1是byte类型 相加的结果int类型
		// 相当于发生从int类型向byte类型转换，从大-->小 发生强制类型转换
		// b1 = b1+3;//需要强制转换

		// b1 = (byte)b1+3;//error
		// b1 = (byte)(b1+3);//损失精度

		System.out.println(b1);

	}
}
