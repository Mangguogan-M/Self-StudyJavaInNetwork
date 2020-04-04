package day20_Exception.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionCatch {
	public static void main(String[] args) {

		// 声明引用指向本类的对象，用于读取文件中的内容
		FileInputStream fis = null;
		try {
			// 随时可能产生文件找不到异常对象 new FileNotFoundException()
			fis = new FileInputStream("c:/a.txt");
		} catch (FileNotFoundException e) {
			// 打印异常的名称、异常原因、异常的位置等信息
			e.printStackTrace();
		}

		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			// System.out.println("系统繁忙，请稍后重试!");
			// 打印异常的名称、异常原因、异常的位置等信息
			e.printStackTrace();
		}

	}
}
