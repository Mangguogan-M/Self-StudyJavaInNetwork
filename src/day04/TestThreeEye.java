package day04;

import java.util.Scanner;

/*
 * 编程使用三目运算符来判断用户输入的整数是正数、负数还是零
 */
public class TestThreeEye {

	public static void main(String[] args) {

		// 1.创建Scanner对象
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数：");

		int num = sc.nextInt();

		// 使用三目运算符进行判断并打印

		System.out.println(num < 0 ? "负数" : (num > 0 ? "正数" : "零"));

	}

}
