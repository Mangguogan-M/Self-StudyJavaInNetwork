package day21_FileAndIO.File.demo1;

import java.io.File;

/*
	 * �ļ������صķ���
			public boolean isDirectory() �ж��Ƿ���Ŀ¼
			public boolean isFile()  �ж��Ƿ����ļ�
			public boolean exists() �ж��Ƿ����
			public boolean canRead()  �ж��Ƿ�ɶ�
			public boolean canWrite() �ж��Ƿ��д
			public boolean isHidden() �ж��Ƿ�����
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("H:\\Java\\OOO\\Jack��.mp4");
		// public boolean isDirectory() �ж��Ƿ���Ŀ¼
		boolean directory = file.isDirectory();
		System.out.println(directory);

		// public boolean isFile() �ж��Ƿ����ļ�
		boolean file2 = file.isFile();
		System.out.println(file2);

		// public boolean exists() �ж��Ƿ����
		boolean exists = file.exists();
		System.out.println(exists);

		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		boolean hidden = file.isHidden();
		System.out.println("�ɶ�:" + canRead);
		System.out.println("��д:" + canWrite);
		System.out.println("����:" + hidden);

	}
}
