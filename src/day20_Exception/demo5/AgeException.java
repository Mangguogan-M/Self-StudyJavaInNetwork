package day20_Exception.demo5;

public class AgeException extends Exception {

	private static final long serialVersionUID = 1L;

	// 自定义无参的构造方法
	public AgeException() {

	}

	// 自定义使用字符串作用参数的构造方法
	public AgeException(String msg) {
		super(msg);
	}
}
