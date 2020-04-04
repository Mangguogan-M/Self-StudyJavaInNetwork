package day21_FileAndIO.File.demo2;

import java.io.File;

/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 */
public class FileCase1 {
	public static void main(String[] args) {

		File file = new File("H:\\");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if (file2.isFile()) {
				if (file2.getName().endsWith(".jpg")) {
					System.out.println(file2.getName());
				}
			}
		}
	}
}
