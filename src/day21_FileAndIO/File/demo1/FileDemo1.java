package day21_FileAndIO.File.demo1;

import java.io.File;

/*
 * File��Ĵ���
 * 
 * File(File parent, String child) 
          	���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 
	File(String pathname) 
          	ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ���� 
	File(String parent, String child) 
          	���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ���� 

 */
public class FileDemo1 {

	public static void main(String[] args) {

		// ��һ�ִ���File�ķ�ʽ File(String pathname) �Ƽ�ʹ�����ַ�ʽ
		File file = new File("H:\\Java\\OOO\\��˾��������.mp4");

		// �ڶ��ַ�ʽ File(File parent, String child)
		File parent = new File("H:\\");
		File file1 = new File(parent, "Java\\OOO\\��˾��������.mp4");

		// �����ַ�ʽ File(String parent, String child)
		File file2 = new File("H:\\", "Java\\OOO\\��˾��������.mp4");

	}
}
