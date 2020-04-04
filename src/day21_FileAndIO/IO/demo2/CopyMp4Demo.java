package day21_FileAndIO.IO.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		
 * 		�ֽ������ַ�ʽ�����ļ���
 * 			�����ֽ���һ�ζ�дһ���ֽڣ�����ʱ��42125����
 * 			�����ֽ���һ�ζ�дһ���ֽ����飺77����
 * 			��Ч�ֽ���һ�ζ�дһ���ֽڣ�303����
 * 			��Ч�ֽ���һ�ζ�дһ���ֽ�����:33����
 */
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		// method1("H:\\Java\\OOO\\��С�� - ӣ�����µ�Լ����ԭ��˵����.mp3", "copy1.mp3");
		// method2("H:\\Java\\OOO\\��С�� - ӣ�����µ�Լ����ԭ��˵����.mp3", "copy1.mp3");
		// method3("H:\\Java\\OOO\\��С�� - ӣ�����µ�Լ����ԭ��˵����.mp3", "copy1.mp3");
		method4("H:\\Java\\OOO\\��С�� - ӣ�����µ�Լ����ԭ��˵����.mp3", "copy1.mp3");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	// �����ֽ���һ�ζ�дһ���ֽ�
	public static void method1(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int num = 0;
		while ((num = fis.read()) != -1) {
			fos.write(num);
		}

		fos.close();
		fis.close();

	}

	// �����ֽ���һ�ζ�дһ���ֽ�����
	public static void method2(String src, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		byte[] by = new byte[1024];
		int num = 0;
		while ((num = fis.read(by)) != -1) {
			fos.write(by, 0, num);
		}

		fos.close();
		fis.close();
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽ�
	public static void method3(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		int num = 0;
		while ((num = bis.read()) != -1) {
			bos.write(num);
		}
		bos.close();
		bis.close();

	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽ�����
	public static void method4(String src, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		byte[] by = new byte[1024];
		int num = 0;
		while ((num = bis.read(by)) != -1) {
			bos.write(by, 0, num);
		}
		bos.close();
		bis.close();
	}
}
