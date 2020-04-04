package day05;

/*
 * 编程实现continue关键字的使用
 */
public class TestContinue {

	public static void main(String[] args) {

		// 循环打印1~10之间的整数
		// 如果能被5整除的数要求不打印

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0) {
				// break;//跳出循环
				continue;// 表示结束本次循环继续下一次循环，去执行i++
			}
			System.out.print(i + "   ");// 1 2 3 4 6 7 8 9
		}

	}
}
