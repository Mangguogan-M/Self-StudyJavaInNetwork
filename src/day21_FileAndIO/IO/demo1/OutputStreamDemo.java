package day21_FileAndIO.IO.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 利用字节输出流向指定文件中写入"helloworld"字符串
 * 
 * 		FileOutputStream(File file)
		FileOutputStream(String name)
		FileOutputStream(File file,boolean append)
		FileOutputStream(String fileName,boolean append)
		
		
		public void write(int b)   将指定字节写入次文件输出流
		public void write(byte[] b)  将b.length个字节从指定byte数组写入到文件输出流中去。
		public void write(byte[] b,int off,int len) 指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 

 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		// 创建字节输出流对象 如果文件不存在会创建文件
		// OutputStream os = new FileOutputStream("斗破苍穹.txt");

		// 向文件中追加内容
		OutputStream os = new FileOutputStream("斗破苍穹.txt", true);

		// 第一种方式 public void write(int b)
		// os.write(97);

		for (int i = 0; i < 3; i++) {

			// 第二种方式 public void write(byte[] b)
			os.write("helloworld".getBytes());
			os.write("\n".getBytes());

		}
		// 第三种方式
		// os.write("helloworld".getBytes(), 0, 3);

		// 释放资源
		// 关闭此文件输出流并释放与此流有关的所有系统资源
		os.close();

		/*
		 * 为什么一定要close呢？ A：让流对象变成垃圾，这样就可以被垃圾回收期回收了 B：通知系统去释放很该文件相关的资源
		 * 
		 */

	}
}
