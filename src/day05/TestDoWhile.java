package day05;

/*
 * 编程使用do-while循环来打印1~10之间的整数
 */
public class TestDoWhile {
	public static void main(String[] args) {

		// 1.使用while循环打印1~10整数
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("----------------------");
		// 2.使用do-while循环打印1~10整数
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);// do-while循环结构在小括号的后面是有分号的，而其他循环并没有

	}
}
