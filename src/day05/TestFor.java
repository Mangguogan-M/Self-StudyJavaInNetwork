package day05;

/*
 * 演示   利用for循环实现无限循环
 */
public class TestFor {

	public static void main(String[] args) {
		int num = 1;
		for (;;) {
			System.out.println("无限循环");
			if (num == 10) {
				break;
			}
			num++;
		}

	}

}
