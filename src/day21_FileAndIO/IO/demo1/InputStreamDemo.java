package day21_FileAndIO.IO.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 演示字节输入流
 * 		InputStream基类
			FileInputStream 子类
			
			把刚才写的数据读取出来显示在控制台
			
			FileInputStream的构造方法
			FileInputStream(File file)
			FileInputStream(String name)
			
			public int read()
				从此输入流中读取一个数据字节。
			public int read(byte[] b)   推荐使用这种方式
				从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
			public int read(byte[] b,int off,int len)
				从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。off:目标数组 b 中的起始偏移量。
 */
public class InputStreamDemo {
	public static void main(String[] args) throws IOException {

		// 1.创建字节输入流对象
		InputStream is = new FileInputStream("斗破苍穹.txt");

		// 2.对文件进行读取
		System.out.println("--------第一种读取方式------");
		/*
		 * long startTime = System.currentTimeMillis(); int num = 0; //read()方法
		 * 当文件读取到末尾的时候返回-1 ,每次读取一个字节，所有说如果读取大文件时效率会比较低 while((num = is.read())!=-1){
		 * System.out.print((char)num); } long endTime = System.currentTimeMillis();
		 * System.out.println(endTime-startTime);
		 */
		System.out.println("--------第二种读取方式------");
		// 缓冲区 比作一辆可以存放1024本书的车
		/*
		 * byte[] by = new byte[1024]; long startTime = System.currentTimeMillis(); int
		 * num = 0; while((num = is.read(by))!=-1){ //将读取的字节序列转换成字符序列 String str = new
		 * String(by, 0, num); } long endTime = System.currentTimeMillis();
		 * System.out.println(endTime-startTime);
		 */

		System.out.println("-----------第三种读取方式---------");
		// public int read(byte[] b,int off,int len)
		// 缓冲区 比作一辆可以存放1024本书的车
		long startTime = System.currentTimeMillis();
		byte[] by = new byte[1024];
		int num = 0;
		while ((num = is.read(by, 0, by.length)) != -1) {
			// 将读取的字节序列转换成字符序列
			String str = new String(by, 0, num);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}
}
