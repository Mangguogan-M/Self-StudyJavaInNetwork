package day03;

import java.util.Scanner;

/*
 * 演示：Scanner类中
 * 		next()和nextLine()方法的差别
 * 
 * 
 * 		next()
			不包含有效字符前的空格
			在输入有效字符之后，将其后输入的空格
			键、Tab键或Enter键等视为分隔符或结束符
		nextLine()
			包含有效字符前的空格
			结束符只是Enter键
 */
public class InputInfo2 {
	public static void main(String[] args) {
		System.out.println("请输入用户名：");
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		System.out.println("用户名是:" + username);

		System.out.println("请输入密码：");
		// String password = sc.nextLine();
		String password = sc.next();
		System.out.println("密码是:" + password);

	}
}
