package day21_FileAndIO.IO.demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * ���û�����ʵ�ֶ��ļ��ļ��ĸ���
 * 
 *  BufferedWriter�����÷�
	BufferedReader�����÷�
		�ַ������������ı��ļ�
	
	���⹦��
	BufferedWriter
	  void newLine()
	BufferedReader
	  String readLine()
	�ַ����������⹦�ܸ����ı��ļ�
 */
public class BufferedWriterToBufferdReader {
	public static void main(String[] args) throws Exception {
		// �����ַ����������� ��ȡ�ļ�
		BufferedReader br = new BufferedReader(new FileReader("����2.txt"));

		// �����ַ���������� д���ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("����3.txt"));

		String str = null;
		// newLine() ���ж�ȡ��һ�ζ�ȡһ���ı���
		// ����ĩβʱ����null
		while ((str = br.readLine()) != null) {
			// д��ָ���ļ�
			bw.write(str);
			// ����
			bw.newLine();
			// ˢ�»�����
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();
		br.close();

	}
}
