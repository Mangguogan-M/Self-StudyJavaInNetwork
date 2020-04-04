package day05;

import java.util.Scanner;

/*
 * 演示是否if分支结构来模拟玩游戏的案例(英雄联盟)
 */
public class TestIf {

	public static void main(String[] args) {

		// 1.提示用户选择英雄
		System.out.println("1.蒙多   2.亚索   3.石头");
		System.out.println("请选择:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 判断 如果用户选择的是1 那么就提示用户成功选择蒙多这个英雄，如果是2 ......
		if (num == 1) {
			System.out.println("蒙多，我的皮很厚......");
		}

		if (num == 2) {
			System.out.println("我比较浪,一旦穿梭就是一条线，谁也挡不住我。");
		}

		if (num == 3) {
			System.out.println("我是从石头里出来的......");
		}

	}

}
