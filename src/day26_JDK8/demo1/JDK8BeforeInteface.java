package day26_JDK8.demo1;

/*
 * JDK8֮ǰ���ӿ��п��Զ�������ͷ���������������public ��static��final��
 * ����������public �� abstract��
 * 
 * JDK8�������ڽӿ��ж���static������default����
 */
public interface JDK8BeforeInteface {

	// static ���η����徲̬����
	static void staticMethod() {
		System.out.println("�ӿ��еľ�̬����");
	}

	// default ���η�����Ĭ�Ϸ���
	default void defaultMethod() {
		System.out.println("�ӿ��е�Ĭ�Ϸ���");
	}

}
