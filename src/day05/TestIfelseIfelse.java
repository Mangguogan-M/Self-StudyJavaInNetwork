package day05;

import java.util.Scanner;

/*
 * 演示使用if-else if-else分支结构模拟火车买票的案例
 * 
 * 		军人			免票
 * 		学生			半票
 * 		其余的人		全票
 * 
 */
public class TestIfelseIfelse {

	public static void main(String[] args) {

		// 1.提示用户输入身份信息
		System.out.println("请输入您的身份信息:");
		Scanner sc = new Scanner(System.in);
		// 使用变量记录身份信息
		String str = sc.next();

		// 判断用户的身份信息，根据不同的身份信息来购买不同价格的车票。
		// == 一般比较地址 字面量 "军人" equals()
		if ("军人".equals(str)) {
			System.out.println("免票");
		} else if ("学生".equals(str)) {
			System.out.println("半票");
		} else {
			System.out.println("全票");
		}

		System.out.println("坐着大巴去路游,一路沙拉黑.....");

	}

}
