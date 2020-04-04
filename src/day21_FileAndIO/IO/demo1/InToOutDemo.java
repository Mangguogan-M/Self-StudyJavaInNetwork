package day21_FileAndIO.IO.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
		文件复制的过程：
			1.先读取文件
			2.在向指定目录输出文件
 */
public class InToOutDemo {
	public static void main(String[] args) throws Exception {
		// 1.先读取文件
		// FileInputStream fis = new FileInputStream("斗破苍穹.txt");
		FileInputStream fis = new FileInputStream("H:\\Java\\OOO\\曹小聪 - 樱花树下的约定（原版说唱）.mp3");
		// 2.在向指定目录输出文件
		FileOutputStream fos = new FileOutputStream("H:\\ss.mp3");

		byte[] by = new byte[1024 * 8];
		int num = 0;
		// 读取文件
		while ((num = fis.read(by)) != -1) {
			// 每读取一次向指定文件中写入一次
			fos.write(by, 0, num);
			fos.flush();// 刷新缓冲区
		}
		// 关闭流
		fos.close();
		fis.close();

	}
}
