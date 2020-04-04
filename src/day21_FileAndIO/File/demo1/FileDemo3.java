package day21_FileAndIO.File.demo1;

import java.io.File;

/*
 * Ŀ¼������صķ���
		public  boolean mkdir()  �����ļ��У���������������ļ��У��Ͳ�������
		public  boolean mkdirs()  �����ļ��У�������ļ��в����ڣ�����㴴������
		 - ��������ļ������ļ�������д�̷�·����Ĭ������Ŀ·����
		public String[] list()  �г�File������������ļ�����·����������String����
		public File[] listFiles() �г�File������������ļ���·��������File����
 */
public class FileDemo3 {
	public static void main(String[] args) {

		// 1.�����ļ���
		File file = new File("С˵//����С˵//������������");
		// file.mkdir();//��������Ŀ¼
		file.mkdirs();// �����༶Ŀ¼

		System.out.println("---------------------------");

		File file2 = new File("C:\\");
		// �г�File������������ļ�����·����������String����
		String[] list = file2.list();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("---------------------------");
		// �г�File������������ļ���·��������File���� �Ƽ�ʹ�����ַ�ʽ
		File[] listFiles = file2.listFiles();
		for (File file3 : listFiles) {
			String name = file3.getName();
			System.out.println(name);
		}
	}
}
