package day26_JDK8.demo1;

public class TestInterface {
	public static void main(String[] args) {
		// static��������ͨ���ӿ������
		JDK8BeforeInteface.staticMethod();

		// default��������ͨ��ʵ����Ķ������
		new JDK8BeforeIntefaceImpl().defaultMethod();
	}
}
