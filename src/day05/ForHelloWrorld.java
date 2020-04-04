package day05;

/*
 * 演示： 输出50句“HelloWorld”
 */
public class ForHelloWrorld {
	public static void main(String[] args) {

		/*
		 * System.out.println("HelloWorld"); System.out.println("HelloWorld");
		 * System.out.println("HelloWorld"); System.out.println("HelloWorld");
		 * System.out.println("HelloWorld");
		 */
		// .....

		int num = 0;
		// 利用for循环来优化代码
		// 在for循环中() 和{} 中声明的变量都叫做块变量,作用域限制于for循环
		for (int i = 0; i < 50; i++) {
			System.out.println("HelloWorld");
			num++;
		}

		System.out.println(num);
	}
}
