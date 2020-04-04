package day03;

import java.util.Scanner;

/*
 * 演示:Scanner的使用
 * 
 * 
 * 		使用步骤
			1.导入包	   
					import java.util.Scanner;
			2.创建Scanner对象
					Scanner input = new Scanner(System.in);
			调用Scanner对象的方法，实现读取
 */
public class InputInfo {
	public static void main(String[] args) {
		System.out.println("*********欢迎进入商品管理系统*********");
		System.out.println("1.用户登录  2.用户注册   3.查询商品");
		System.out.println("4.添加商品  5.订单查询   6.购物查询");
		System.out.println("7.退出系统");
		System.out.println("请选择:");

		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);

		// 读取内容 调用Scanner对象的方法，实现读取
		String str = sc.next();

		// String str1 = sc.next();

		System.out.println("用户输入的是：" + str);
		// System.out.println("用户输入的是："+str1);

	}
}
