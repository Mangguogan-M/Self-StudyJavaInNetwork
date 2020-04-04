package day21_FileAndIO.IO.demo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 演示 字节输入缓冲流
 * 		BufferdInputStream
 */
public class BufferdInputStreamDemo {
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("斗破苍穹.txt"));

		byte[] by = new byte[1024];
		int num = 0;
		// 读取数据
		while ((num = bis.read(by)) != -1) {
			System.out.println(new String(by, 0, num));
		}

		// 释放资源
		bis.close();
	}
}
