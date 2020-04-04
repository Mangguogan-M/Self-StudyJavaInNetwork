package day05;

import java.util.Scanner;

/*
 * 通过if来判断用户输入的数是不是整数
 */
public class TestIf2 {
	public static void main(String[] args) {

		// 1.提示用户输入整数
		System.out.println("请输入一个整数：");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("整数");
		}

		System.out.println("负数");
	}
}
