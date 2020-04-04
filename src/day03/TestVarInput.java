package day03;

import java.util.Scanner;

/*
 * 编程实现变量的输入和输出
 */
public class TestVarInput {

	public static void main(String[] args) {

		// 1.声明两个变量用于记录姓名和年龄,变量随使用随声明
		// String name ="张三";
		// int age = 18;

		// 提示用户输入姓名和年龄，并存储到上述声明的变量中
		System.out.println("请输入您的姓名和年龄：");

		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);

		// 从键盘输入的信息中读取一个字符串内容放入变量name对应的空间中
		String name = sc.next();
		//// 从键盘输入的信息中读取一个整数内容放入变量age对应的空间中
		int age = sc.nextInt();

		// 打印两个变量的数值
		System.out.println("name = " + name + ",age=" + age);

	}

}
