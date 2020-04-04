package day04;

/*
 * 判断ia变量中记录的整数是否为两位数整数   10~99
 */
public class TestLogic {
	public static void main(String[] args) {

		int ia = 11;

		// ia大于等于10 并且 ia小于等于 99， 如果满足返回true 否则返回false
		System.out.println(ia >= 10 && ia <= 99);

		System.out.println("----------------");

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2);// false
		System.out.println(b1 || b2);// true
		System.out.println(!b1);// false
		System.out.println(!b2);// true

		System.out.println("----------------");

		int ib = 3;
		int ic = 2;

		// 第一个条件为假，跳过第二个条件执行
		boolean b3 = (++ib == 3 && ++ic == 3);
		System.out.println(b3);// false
		System.out.println(ib);// 4
		System.out.println(ic);// 2

		System.out.println("----------------");
		// 第一个条件为真后，跳过第二个条件的执行
		boolean b4 = (++ib == 5 || ++ic == 3);
		System.out.println(b4);// true
		System.out.println(ib);// 5
		System.out.println(ic);// 2

	}
}
