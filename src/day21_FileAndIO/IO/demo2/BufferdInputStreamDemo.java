package day21_FileAndIO.IO.demo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ��ʾ �ֽ����뻺����
 * 		BufferdInputStream
 */
public class BufferdInputStreamDemo {
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("���Ʋ��.txt"));

		byte[] by = new byte[1024];
		int num = 0;
		// ��ȡ����
		while ((num = bis.read(by)) != -1) {
			System.out.println(new String(by, 0, num));
		}

		// �ͷ���Դ
		bis.close();
	}
}
