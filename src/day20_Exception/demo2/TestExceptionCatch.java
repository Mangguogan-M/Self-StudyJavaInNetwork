package day20_Exception.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionCatch {
	public static void main(String[] args) {

		// ��������ָ����Ķ������ڶ�ȡ�ļ��е�����
		FileInputStream fis = null;
		try {
			// ��ʱ���ܲ����ļ��Ҳ����쳣���� new FileNotFoundException()
			fis = new FileInputStream("c:/a.txt");
		} catch (FileNotFoundException e) {
			// ��ӡ�쳣�����ơ��쳣ԭ���쳣��λ�õ���Ϣ
			e.printStackTrace();
		}

		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			// System.out.println("ϵͳ��æ�����Ժ�����!");
			// ��ӡ�쳣�����ơ��쳣ԭ���쳣��λ�õ���Ϣ
			e.printStackTrace();
		}

	}
}
