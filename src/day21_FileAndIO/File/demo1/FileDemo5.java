package day21_FileAndIO.File.demo1;

import java.io.File;
import java.text.SimpleDateFormat;

/*
 * ������ȡ����
		public String getAbsolutePath()  ��ȡ����·��
		public String getPath()  ��ȡ���·��
		public String getName()  ��ȡ����
		public long length()  ��ȡ���ȣ��ֽ���
		public long lastModified()  ��ȡ���һ���޸�ʱ�䣬����ֵ
	������
		public  boolean renameTo(File dest)
 * 
 */
public class FileDemo5 {
	public static void main(String[] args) {

		File file = new File("H:\\Java\\OOO\\Jack��.mp4");
		// ��ȡ����·��
		String absolutePath = file.getAbsolutePath();
		// ��ȡ���·��
		String path = file.getPath();
		// ��ȡ����
		String name = file.getName();
		// ��ȡ���ȣ��ֽ���
		long length = file.length();
		// ���һ���޸�ʱ�䣬����ֵ
		long lastModified = file.lastModified();

		System.out.println("����·��:" + absolutePath);
		System.out.println("���·��:" + path);
		System.out.println("����:" + name);
		System.out.println("����:" + length);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(lastModified);

		System.out.println("�޸�ʱ��:" + format);

		System.out.println("-------------------------");
		/*
		 * ������ public boolean renameTo(File dest)
		 */

		/*
		 * ���·������ͬ�����Ǹ��� ���·������ͬ�����Ǹ������� ·�����̷���ʼ������·�� H:\\ ·�������̷���ʼ:���·�� xx.mp4
		 */
		File newFile = new File("xxx��.mp4");
		newFile.renameTo(file);

	}
}
