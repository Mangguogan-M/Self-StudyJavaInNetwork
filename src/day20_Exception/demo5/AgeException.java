package day20_Exception.demo5;

public class AgeException extends Exception {

	private static final long serialVersionUID = 1L;

	// �Զ����޲εĹ��췽��
	public AgeException() {

	}

	// �Զ���ʹ���ַ������ò����Ĺ��췽��
	public AgeException(String msg) {
		super(msg);
	}
}
