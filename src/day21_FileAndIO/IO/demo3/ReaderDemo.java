package day21_FileAndIO.IO.demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Reader：字符输入流基类
		FileReader
		
		FileReader的构造方法
		FileReader(File file)
		FileReader(String fileName)
		
		public int read()
			读取单个字符
		public int read(char[] b)
			将字符读入数组
		public int read(char[] b,int off,int len)
			将字符读入数组的某一部分。


 */
public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		// 1.字符输入流
		Reader r = new FileReader("斗破苍穹.txt");

		int num = 0;
		char[] ch = new char[1024];
		// 每次读取指定数组空间的字符
		while ((num = r.read(ch)) != -1) {
			String str = new String(ch, 0, num);
			System.out.println(str);
		}

		r.close();

	}
}
