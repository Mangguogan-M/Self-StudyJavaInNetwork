package day21_FileAndIO.IO.demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * ��ʾ��ӡ�����PrintStream
 */
public class TestPrintStream {
	public static void main(String[] args) {

		try {
			// 1.����PrintStream���͵Ķ�����H:\\a.txt�ļ�����
			PrintStream ps = new PrintStream(new FileOutputStream("H:\\a.txt"));
			// 2.���������д���ַ�������
			ps.println("hello");
			System.out.println("д�����ݳɹ�!");
			// 3.�ر������ͷ��йص���Դ
			ps.close();

			// ��ϰ��ʹ��PrintStream��BufferedReader�������������¼
			// Ҫ�󲻶ϵ���ʾ�û�����Ҫ���͵����ݣ��ж��Ƿ�Ϊ"bye"�����������
			// ���룬��������д���ļ�H:\\a.txt��

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
