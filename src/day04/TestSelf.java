package day04;

/*
 * 编程实现自增、自减运算符的使用 ++  --
 */
public class TestSelf {
	public static void main(String[] args) {

		int ia = 3;
		System.out.println(ia);// 3

		// 让ia数值 自身加1
		int ib = ia++;
		System.out.println(ia);// 4
		System.out.println(ib);// 3

		System.out.println("---------------");

		// 后++，表示进行其他操作，再使用，也就是说，先输出再赋值 所以输出后ia的值会变成 5
		System.out.println(ia++);// 4
		// 前++表示先++再使用，也就是让++之后的结果作为表达式结果，输出 6
		System.out.println(++ia);// 6

		System.out.println("---------------");
		// 笔试题 建议开发中绝对不允许使用
		System.out.println(ia);// 6
		System.out.println(ia++ + ++ia); // 14 = 6 + 8
		System.out.println(ia);// 8

	}
}
