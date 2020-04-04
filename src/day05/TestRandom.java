package day05;

import java.util.Random;

/*
 * 编程实现随机数的生成
 */
public class TestRandom {
	public static void main(String[] args) {

		// 创建随机类的对象
		Random r = new Random();

		// 生成的随机在 1~100之间的整数
		int num = r.nextInt(100) + 1;

		System.out.println("生成的随机数是：" + num);
	}
}
