package day21_FileAndIO.File.demo1;

import java.io.File;
import java.io.IOException;

/*
 * �ļ�������صķ���
	public  boolean createNewFile()   �����ļ���������������ļ����Ͳ�������
	public  boolean delete()  Java�е�ɾ�����߻���վ��Ҫɾ��һ���ļ��У�ע���ļ����ڲ��ܰ����ļ����ļ���
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		// 1.�����ļ� �����ָ��·�� Ĭ������Ŀ�´���
		File file = new File("����.txt");
		// 2.�����ļ�
		boolean b = file.createNewFile();
		if (b) {
			System.out.println("�����ɹ�");
		}

		// 3.ɾ���ļ�
		boolean delete = file.delete();
		if (delete) {
			System.out.println("ɾ���ɹ�");
		}

	}
}
