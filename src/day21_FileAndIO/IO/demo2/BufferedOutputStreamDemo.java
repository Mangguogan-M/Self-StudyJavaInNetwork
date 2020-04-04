package day21_FileAndIO.IO.demo2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 缓冲区类(高效类)
 * 
 * 		演示字节输出缓冲流
 * 
 * 		构造方法可以指定缓冲区大小，但是我们一般不用，因为默认缓冲区大小足够了。
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		// FileOutputStream fos = new FileOutputStream("斗破苍穹.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 简单写法
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("斗破苍穹.txt"));

		bos.write("hello".getBytes());

		// 释放资源
		bos.close();

	}
}
