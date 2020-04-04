package day21_FileAndIO.IO.demo3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Writer：字符输出流基类
		FileWriter：子类
		
		FileWriter的构造方法
		FileWriter(File file)
		FileWriter(String fileName)
		FileWriter(File file,boolean append)
		FileWriter(String fileName,boolean append)
		
		
		public void write(String str)
		public void write(String str,int off,int len)
		public void write(int c)
		public void writer(char[] cbuf)
		public void write(char[] b,int off,int len)
		
		
		注：字符流使用了缓冲区

 */
public class WriterDemo {
	public static void main(String[] args) throws IOException {

		// 1.创建字符输出流
		Writer w = new FileWriter("斗破苍穹.txt");
		w.write("第一章  小飞与小红一起修炼的日子 \n");
		w.write("第二章  山洞机遇");

		// 注意：如果不关闭流或者刷新缓冲区 那么数据将一直在缓冲区存放
		w.flush();
		w.close();

	}
}
