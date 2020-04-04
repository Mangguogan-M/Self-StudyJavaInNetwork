package day21_FileAndIO.IO.demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * 字符流实现文件复制
 */
public class RWDemo {
	public static void main(String[] args) throws Exception {
		// 1.利于字符流读取文件
		Reader r = new FileReader("斗破苍穹.txt");
		// 2.利用字符流写入文件
		Writer w = new FileWriter("斗破2.txt");
		int num = 0;
		// 读取 每次读取一个字符(2个字节)
		while ((num = r.read()) != -1) {
			// 写入指定文件
			w.write(num);
			w.flush();// 刷新缓冲区
		}

		w.close();
		r.close();

	}
}
