package day21_FileAndIO.IO.demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 利用缓冲流实现对文件文件的复制
 * 
 *  BufferedWriter基本用法
	BufferedReader基本用法
		字符缓冲流复制文本文件
	
	特殊功能
	BufferedWriter
	  void newLine()
	BufferedReader
	  String readLine()
	字符缓冲流特殊功能复制文本文件
 */
public class BufferedWriterToBufferdReader {
	public static void main(String[] args) throws Exception {
		// 创建字符缓冲输入流 读取文件
		BufferedReader br = new BufferedReader(new FileReader("斗破2.txt"));

		// 创建字符缓冲输出流 写入文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("斗破3.txt"));

		String str = null;
		// newLine() 按行读取，一次读取一个文本行
		// 读到末尾时返回null
		while ((str = br.readLine()) != null) {
			// 写入指定文件
			bw.write(str);
			// 换行
			bw.newLine();
			// 刷新缓冲区
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();

	}
}
