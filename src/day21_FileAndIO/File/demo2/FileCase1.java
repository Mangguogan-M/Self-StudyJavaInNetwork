package day21_FileAndIO.File.demo2;

import java.io.File;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
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
