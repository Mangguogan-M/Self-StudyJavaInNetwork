package day21_FileAndIO.File.demo1;

import java.io.File;

/*
	 * 文件检测相关的方法
			public boolean isDirectory() 判断是否是目录
			public boolean isFile()  判断是否是文件
			public boolean exists() 判断是否存在
			public boolean canRead()  判断是否可读
			public boolean canWrite() 判断是否可写
			public boolean isHidden() 判断是否隐藏
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("H:\\Java\\OOO\\Jack马.mp4");
		// public boolean isDirectory() 判断是否是目录
		boolean directory = file.isDirectory();
		System.out.println(directory);

		// public boolean isFile() 判断是否是文件
		boolean file2 = file.isFile();
		System.out.println(file2);

		// public boolean exists() 判断是否存在
		boolean exists = file.exists();
		System.out.println(exists);

		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		boolean hidden = file.isHidden();
		System.out.println("可读:" + canRead);
		System.out.println("可写:" + canWrite);
		System.out.println("隐藏:" + hidden);

	}
}
