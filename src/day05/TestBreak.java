package day05;

import java.util.Scanner;

/*
 * 演示break的使用
 */
public class TestBreak {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);// 输出循环变量
			if (i % 5 == 0) {
				break;// 跳出循环执行后续的语句
			}
		}

		// 后续的语句

		System.out.println("----------------");

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. 用户登录   2.用户注册     3.退出系统");
			System.out.println("请选择:");
			int num = sc.nextInt();

			if (num == 3) {
				break;
			}

		}

		System.out.println("成功退出系统，欢迎下次在来.....");

	}
}
