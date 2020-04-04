package day20_Exception.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  	 ArithmeticException - 算数异常类
		 ArrayIndexOutOfBoundsException(间接子类) -  数组下标越界异常 
		 NullPointerException - 空指针异常
		 ClassCastException - 类型转换异常
		 NumberFormatException(间接子类) - 数字格式异常 
 */
public class TestRuntimeException {
	public static void main(String[] args) {
		// 观察检测性异常
		// FileInputStream fis = new FileInputStream("c:/a.txt");

		// 观察算数异常的发生
		int a = 10;
		int b = 0;
		if (b != 0) {
			System.out.println(10 / 0);// java.lang.ArithmeticException 算数异常
		}

		// 数组下标越界异常
		int[] arr = new int[3];
		int num = 3;
		if (num >= 0 && num < arr.length) {
			System.out.println(arr[num]);// java.lang.ArrayIndexOutOfBoundsException
		}

		// java.lang.NullPointerException
		String str = null;
		if (str != null) {
			System.out.println(str.length());
		}

		// java.lang.ClassCastException
		Exception ex = new Exception();
		if (ex instanceof IOException) {
			IOException ie = (IOException) ex;
		}

		// NumberFormatException
		String s = "12be";
		if (s.matches("\\d+")) {
			System.out.println(Integer.parseInt(s));
		}
		System.out.println("程序运行结束");
	}
}
