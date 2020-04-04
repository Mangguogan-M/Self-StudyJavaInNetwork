package day20_Exception.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  	 ArithmeticException - �����쳣��
		 ArrayIndexOutOfBoundsException(�������) -  �����±�Խ���쳣 
		 NullPointerException - ��ָ���쳣
		 ClassCastException - ����ת���쳣
		 NumberFormatException(�������) - ���ָ�ʽ�쳣 
 */
public class TestRuntimeException {
	public static void main(String[] args) {
		// �۲������쳣
		// FileInputStream fis = new FileInputStream("c:/a.txt");

		// �۲������쳣�ķ���
		int a = 10;
		int b = 0;
		if (b != 0) {
			System.out.println(10 / 0);// java.lang.ArithmeticException �����쳣
		}

		// �����±�Խ���쳣
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
		System.out.println("�������н���");
	}
}
