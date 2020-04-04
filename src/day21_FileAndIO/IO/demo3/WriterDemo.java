package day21_FileAndIO.IO.demo3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Writer���ַ����������
		FileWriter������
		
		FileWriter�Ĺ��췽��
		FileWriter(File file)
		FileWriter(String fileName)
		FileWriter(File file,boolean append)
		FileWriter(String fileName,boolean append)
		
		
		public void write(String str)
		public void write(String str,int off,int len)
		public void write(int c)
		public void writer(char[] cbuf)
		public void write(char[] b,int off,int len)
		
		
		ע���ַ���ʹ���˻�����

 */
public class WriterDemo {
	public static void main(String[] args) throws IOException {

		// 1.�����ַ������
		Writer w = new FileWriter("���Ʋ��.txt");
		w.write("��һ��  С����С��һ������������ \n");
		w.write("�ڶ���  ɽ������");

		// ע�⣺������ر�������ˢ�»����� ��ô���ݽ�һֱ�ڻ��������
		w.flush();
		w.close();

	}
}
