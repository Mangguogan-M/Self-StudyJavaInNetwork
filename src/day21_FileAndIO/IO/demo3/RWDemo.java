package day21_FileAndIO.IO.demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * �ַ���ʵ���ļ�����
 */
public class RWDemo {
	public static void main(String[] args) throws Exception {
		// 1.�����ַ�����ȡ�ļ�
		Reader r = new FileReader("���Ʋ��.txt");
		// 2.�����ַ���д���ļ�
		Writer w = new FileWriter("����2.txt");
		int num = 0;
		// ��ȡ ÿ�ζ�ȡһ���ַ�(2���ֽ�)
		while ((num = r.read()) != -1) {
			// д��ָ���ļ�
			w.write(num);
			w.flush();// ˢ�»�����
		}

		w.close();
		r.close();

	}
}
