package day21_FileAndIO.IO.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
		�ļ����ƵĹ��̣�
			1.�ȶ�ȡ�ļ�
			2.����ָ��Ŀ¼����ļ�
 */
public class InToOutDemo {
	public static void main(String[] args) throws Exception {
		// 1.�ȶ�ȡ�ļ�
		// FileInputStream fis = new FileInputStream("���Ʋ��.txt");
		FileInputStream fis = new FileInputStream("H:\\Java\\OOO\\��С�� - ӣ�����µ�Լ����ԭ��˵����.mp3");
		// 2.����ָ��Ŀ¼����ļ�
		FileOutputStream fos = new FileOutputStream("H:\\ss.mp3");

		byte[] by = new byte[1024 * 8];
		int num = 0;
		// ��ȡ�ļ�
		while ((num = fis.read(by)) != -1) {
			// ÿ��ȡһ����ָ���ļ���д��һ��
			fos.write(by, 0, num);
			fos.flush();// ˢ�»�����
		}
		// �ر���
		fos.close();
		fis.close();

	}
}
