package day21_FileAndIO.IO.demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 演示打印输出流PrintStream
 */
public class TestPrintStream {
	public static void main(String[] args) {

		try {
			// 1.构造PrintStream类型的对象与H:\\a.txt文件关联
			PrintStream ps = new PrintStream(new FileOutputStream("H:\\a.txt"));
			// 2.向输出流中写入字符串内容
			ps.println("hello");
			System.out.println("写入数据成功!");
			// 3.关闭流并释放有关的资源
			ps.close();

			// 练习：使用PrintStream和BufferedReader类来生成聊天记录
			// 要求不断地提示用户输入要发送的内容，判断是否为"bye"，若是则结束
			// 输入，若不是则写入文件H:\\a.txt中

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
