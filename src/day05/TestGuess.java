package day05;

import java.util.Random;
import java.util.Scanner;

/*
 * 编程实现猜数字游戏
 */
public class TestGuess {

	public static void main(String[] args) {
		// 创建随机类的对象
		Random r = new Random();

		// 生成的随机在 1~100之间的整数
		int num = r.nextInt(100) + 1;
		System.out.println(num);

		for (;;) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();

			if (a == num) {
				System.out.println("猜对了");
				break;
			} else {
				System.out.println("猜错了");
			}

		}

	}
}
