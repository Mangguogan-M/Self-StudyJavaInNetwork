package day05;

import java.util.Scanner;

/*
 * 演示：嵌套循环
 * 		有3个班级各4名学员参赛，如何计算每个班级参赛学员的平均分？
 */
public class TestForFor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入第" + i + "个班级的成绩");
			int sum = 0;
			// 4名学员参赛
			for (int j = 1; j <= 4; j++) {
				System.out.println("第" + j + "个学生的成绩：");
				int score = sc.nextInt();
				sum += score;
			}
			System.out.println("第" + i + "个班级的平均分是:" + (sum / 4));
		}

	}
}
