package day22_Threadd.demo1;

/*
 * ��ʾ�����г����ǵ��̻߳��Ƕ��̣߳�
 * 		
 * 		���а������ڵ��̳߳���ֻ��һ��ִ��·��
 * 
 */
public class TestThread {
	public static void main(String[] args) {
		show();
	}

	private static void show() {
		method1();
		method2();
	}

	private static void method2() {
		System.out.println("method2����");
	}

	private static void method1() {
		System.out.println("method1����");
	}
}
