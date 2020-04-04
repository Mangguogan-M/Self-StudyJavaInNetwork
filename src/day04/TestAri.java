package day04;

/*
 * 编程实现算数运算符的使用 +  -  *  /  %
 */
public class TestAri {

	public static void main(String[] args) {

		// 声明两个int类型的变量存储整型
		int ia = 10;
		int ib = 5;

		// 打印变量
		System.out.println("ia =" + ia);
		System.out.println("ib =" + ib);

		System.out.println("-------------------------");

		// 表示将ia+ib的结果赋值给变量res 进行保存
		// 其中将 ia+ib整体称之为表达式,ia和ib叫做操作数， + 叫做操作符/运算符
		int res = ia + ib;
		System.out.println("res=" + res);// res=15

		// 表示先计算ia+ib的结果再进行打印输出，打印完毕后数据丢失
		System.out.println(ia + ib);// 15
		System.out.println(ia - ib);// 5
		System.out.println(ia * ib);// 50
		System.out.println(ia / ib);// 2
		System.out.println(ia % ib);// 0

		System.out.println("-------------------------");

		// 整数相除，只能取整数部分，小数部分舍弃。
		System.out.println(5 / 2);// 2
		System.out.println((double) 5 / 2);// 2.5

		System.out.println(5 / (double) 2);// 2.5
		System.out.println((double) (5 / 2));// 2.0

		System.out.println(1.0 * 5 / 2);// 2.5

		System.out.println("-------------------------");

		// 0不能做除数， 否则产生 java.lang.ArithmeticException(算数异常): / by zero
		// System.out.println(5 / 0);
		// System.out.println(5 / 0.0);//Infinity 无穷大

		System.out.println(0 / 0.0);// NaN Not a Number

		System.out.println("-------------------------");
		// + 字符串连接符

		System.out.println("2" + 4 + 3);// 243
		System.out.println(4 + 3 + "2");// 72

	}

}
