package day14;

import java.util.Scanner;

/*
 * 通过equalsIgnoreCase实现用户登录
 */
public class TestStringLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 3.使用for循环来模拟给用户3次输入的机会
		for (int i = 3; i > 0; i--) {

			// 1.提示用户分别输入用户名和密码信息
			System.out.println("请输入用户名信息：");
			String username = sc.nextLine();

			System.out.println("请输入密码信息：");
			String password = sc.nextLine();

			// 2.判断用户输入的用户名和密码是否正确，并给出相对应的提示
			// 当字符串字面值和字符串变量比较是否相等的时候，推荐使用字符串字面值来调用方法
			// 避免空指针异常的发生
			if ("admin".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)) {
				System.out.println("登录成功！");
				break;
			} else {
				System.out.println("用户名或密码错误，登录失败，您还有" + (i - 1) + "次机会");
			}

			// 当用户使用完毕最后一次机会后，则冻结账户
			if (i == 1) {
				System.out.println("账号已冻结，明天再试");
			}

		}

	}
}
