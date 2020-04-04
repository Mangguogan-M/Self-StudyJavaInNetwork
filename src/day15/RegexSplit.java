package day15;

import java.util.Scanner;

/*
 * 分割功能
		public String[] split(String regex)
		根据给定正则表达式匹配拆分此字符串
		
		
 */
public class RegexSplit {
	public static void main(String[] args) {

		// 定义一个年龄的搜索范围
		String ages = "18-24";

		String reg = "-";

		String[] split = ages.split(reg);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// 如果想要得到int类型

		int startAge = Integer.parseInt(split[0]);

		int endAge = Integer.parseInt(split[1]);

		// 键盘录入年龄
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= startAge && age <= endAge) {
			System.out.println("可以结婚了。");
		} else {
			System.out.println("不符合我的要求，gun");
		}

		System.out.println("-------------------");
		String str = "1,2,3,4,5,6";
		String[] split2 = str.split(",");
		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
		}

	}
}
