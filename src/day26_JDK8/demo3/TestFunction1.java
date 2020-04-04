package day26_JDK8.demo3;

/*public class TestFunction1 {
	
	public static void main(String[] args) {
		Call c = new Call() {
			
			@Override
			public void applay(int i) {
				System.out.println(i);
			}
		};
		c.applay(8);
	}
}
interface Call{
	void applay(int i);
}*/
//����ʽ�ӿ���ʵ��Ϊ��lambda���ʽ�������
//����ʽ�ӿ���ȫ����Ϊ��ʵ��lambda���ʽ�������
public class TestFunction1 {
	public static void main(String[] args) {
		Call c = x -> System.out.println(x);
		c.applay(8);
	}
}

// ��ȷ�ĺ���ʽ�ӿ�
@FunctionalInterface
interface Call {
	// ���󷽷�
	void applay(int i);

	// static ���ǳ��󷽷�
	public static void staticMethod() {

	}

	// default���ǳ��󷽷�
	public default void defaultMethod() {

	}

	// java.lang.Object�еķ������ǳ��󷽷�
	public boolean equals(Object obj);

}