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
			System.out.println("�����Ƿ����쳣��Ҫִ������Ҹ����ƺ�");
		}

		System.out.println("������������");

	}
}
