package day21_FileAndIO.IO.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * �����ֽ��������ָ���ļ���д��"helloworld"�ַ���
 * 
 * 		FileOutputStream(File file)
		FileOutputStream(String name)
		FileOutputStream(File file,boolean append)
		FileOutputStream(String fileName,boolean append)
		
		
		public void write(int b)   ��ָ���ֽ�д����ļ������
		public void write(byte[] b)  ��b.length���ֽڴ�ָ��byte����д�뵽�ļ��������ȥ��
		public void write(byte[] b,int off,int len) ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 

 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		// �����ֽ���������� ����ļ������ڻᴴ���ļ�
		// OutputStream os = new FileOutputStream("���Ʋ��.txt");

		// ���ļ���׷������
		OutputStream os = new FileOutputStream("���Ʋ��.txt", true);

		// ��һ�ַ�ʽ public void write(int b)
		// os.write(97);

		for (int i = 0; i < 3; i++) {

			// �ڶ��ַ�ʽ public void write(byte[] b)
			os.write("helloworld".getBytes());
			os.write("\n".getBytes());

		}
		// �����ַ�ʽ
		// os.write("helloworld".getBytes(), 0, 3);

		// �ͷ���Դ
		// �رմ��ļ���������ͷ�������йص�����ϵͳ��Դ
		os.close();

		/*
		 * Ϊʲôһ��Ҫclose�أ� A�����������������������Ϳ��Ա����������ڻ����� B��֪ͨϵͳȥ�ͷźܸ��ļ���ص���Դ
		 * 
		 */

	}
}
