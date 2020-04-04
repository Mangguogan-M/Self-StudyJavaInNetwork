package day05;

/*
 * 编程使用for循环打印 10~1之间的整数
 */
public class TestForNum {
	public static void main(String[] args) {

		// int i = 1;
		// 循环打印1~10之间的整数
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		System.out.println("-----------------------");
		// 循环打印10~1之间的整数
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("------------------------");
		// 使用for循环打印1~100之间的奇数
		for (int i = 1; i <= 100; i++) {
			// 当需要在某个场合进行条件判断的时候，有选择去执行一段代码的时候，需要使用分支结构
			if (i % 2 != 0) {// 如果i取余2 不等于0 说明不能被2整数 ，那么就是奇数
				System.out.print(i + "   ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + "   ");
		}

		System.out.println("------------------------");
		// 使用for循环打印1~100之间的偶数
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {// 如果i能被2整数 说明是偶数
				System.out.print(i + "   ");
			}
		}
		System.out.println();
		System.out.println("------------------------");

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + "   ");
		}

	}
}
