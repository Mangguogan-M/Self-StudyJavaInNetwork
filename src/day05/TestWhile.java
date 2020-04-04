package day05;

/*
 * 通过编程实现while循环的使用，打印1~10之间的整数
 */
public class TestWhile {

	public static void main(String[] args) {

		// 使用for循环打印
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------");

		// 使用while循环打印
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("跳出了while循环");

		System.out.println("--------------------");
		int num = 1;
		while (true) {
			if (num == 11) {
				break;
			}
			System.out.println(num);
			num++;
		}
	}

}
