package day05;

import java.util.Scanner;

/*
 * 演示switch-case结构的使用
 */
public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("*********欢迎进入商品管理系统*********");
		System.out.println("1.用户登录  2.用户注册   3.查询商品");
		System.out.println("4.添加商品  5.订单查询   6.购物查询");
		System.out.println("7.退出系统");
		System.out.println("请选择:");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		switch (num) {
		case 1:
			// 语句块1
			System.out.println("请输入用户");
			System.out.println("请输入密码");
			break;// break 执行完语句退出switch块，不继续执行下面的语句
		case 2:
			// 语句块2
			System.out.println("请输入需要注册的信息");
			break;
		case 3:
			// 语句块3
			System.out.println("商品信息展示");
			break;

		default:
			System.out.println("请输入正确的数字。");
		}

		System.out.println("退出商品管理系统");
	}
}
