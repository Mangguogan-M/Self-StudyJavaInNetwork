package day21_FileAndIO.IO.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		
 * 		字节流四种方式复制文件：
 * 			基本字节流一次读写一个字节：共耗时：42125毫秒
 * 			基本字节流一次读写一个字节数组：77毫秒
 * 			高效字节流一次读写一个字节：303毫秒
 * 			高效字节流一次读写一个字节数组:33毫秒
 */
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		// method1("H:\\Java\\OOO\\曹小聪 - 樱花树下的约定（原版说唱）.mp3", "copy1.mp3");
		// method2("H:\\Java\\OOO\\曹小聪 - 樱花树下的约定（原版说唱）.mp3", "copy1.mp3");
		// method3("H:\\Java\\OOO\\曹小聪 - 樱花树下的约定（原版说唱）.mp3", "copy1.mp3");
		method4("H:\\Java\\OOO\\曹小聪 - 樱花树下的约定（原版说唱）.mp3", "copy1.mp3");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	// 基本字节流一次读写一个字节
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

	// 基本字节流一次读写一个字节数组
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

	// 高效字节流一次读写一个字节
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

	// 高效字节流一次读写一个字节数组
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
