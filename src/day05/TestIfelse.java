package day05;

import java.util.Scanner;

/*
 * 演示if-else 分支结构模拟考试是否通过这样的案例
 */
public class TestIfelse {
	public static void main(String[] args) {

		// 1.提示用于输入考试成绩
		System.out.println("请输入您的考试成绩:");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		// 2.通过用户输入的考试成绩来判断成绩是否合格，如果合格进入下一个阶段，否则等待补考
		if (score >= 60) {// 如果大于等于60分 走下面
			System.out.println("成绩合格，进入下个阶段。");
		} else {// 否则走这边
			System.out.println("等待下次补考通知......");
		}

		System.out.println("世界上最遥远的距离就是你在if而我在else，看似相交却又永远分离。");

	}
}
