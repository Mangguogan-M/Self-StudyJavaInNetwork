package day21_FileAndIO.IO.demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Reader���ַ�����������
		FileReader
		
		FileReader�Ĺ��췽��
		FileReader(File file)
		FileReader(String fileName)
		
		public int read()
			��ȡ�����ַ�
		public int read(char[] b)
			���ַ���������
		public int read(char[] b,int off,int len)
			���ַ����������ĳһ���֡�


 */
public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		// 1.�ַ�������
		Reader r = new FileReader("���Ʋ��.txt");

		int num = 0;
		char[] ch = new char[1024];
		// ÿ�ζ�ȡָ������ռ���ַ�
		while ((num = r.read(ch)) != -1) {
			String str = new String(ch, 0, num);
			System.out.println(str);
		}

		r.close();

	}
}
