package day21_FileAndIO.IO.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * ��ʾ�ֽ�������
 * 		InputStream����
			FileInputStream ����
			
			�Ѹղ�д�����ݶ�ȡ������ʾ�ڿ���̨
			
			FileInputStream�Ĺ��췽��
			FileInputStream(File file)
			FileInputStream(String name)
			
			public int read()
				�Ӵ��������ж�ȡһ�������ֽڡ�
			public int read(byte[] b)   �Ƽ�ʹ�����ַ�ʽ
				�Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
			public int read(byte[] b,int off,int len)
				�Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С�off:Ŀ������ b �е���ʼƫ������
 */
public class InputStreamDemo {
	public static void main(String[] args) throws IOException {

		// 1.�����ֽ�����������
		InputStream is = new FileInputStream("���Ʋ��.txt");

		// 2.���ļ����ж�ȡ
		System.out.println("--------��һ�ֶ�ȡ��ʽ------");
		/*
		 * long startTime = System.currentTimeMillis(); int num = 0; //read()����
		 * ���ļ���ȡ��ĩβ��ʱ�򷵻�-1 ,ÿ�ζ�ȡһ���ֽڣ�����˵�����ȡ���ļ�ʱЧ�ʻ�Ƚϵ� while((num = is.read())!=-1){
		 * System.out.print((char)num); } long endTime = System.currentTimeMillis();
		 * System.out.println(endTime-startTime);
		 */
		System.out.println("--------�ڶ��ֶ�ȡ��ʽ------");
		// ������ ����һ�����Դ��1024����ĳ�
		/*
		 * byte[] by = new byte[1024]; long startTime = System.currentTimeMillis(); int
		 * num = 0; while((num = is.read(by))!=-1){ //����ȡ���ֽ�����ת�����ַ����� String str = new
		 * String(by, 0, num); } long endTime = System.currentTimeMillis();
		 * System.out.println(endTime-startTime);
		 */

		System.out.println("-----------�����ֶ�ȡ��ʽ---------");
		// public int read(byte[] b,int off,int len)
		// ������ ����һ�����Դ��1024����ĳ�
		long startTime = System.currentTimeMillis();
		byte[] by = new byte[1024];
		int num = 0;
		while ((num = is.read(by, 0, by.length)) != -1) {
			// ����ȡ���ֽ�����ת�����ַ�����
			String str = new String(by, 0, num);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}
}
