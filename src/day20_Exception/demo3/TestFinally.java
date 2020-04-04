package day20_Exception.demo3;

public class TestFinally {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("无论是否发生异常都要执行这里，我负责善后");
		}

		System.out.println("程序正常结束");

	}
}
