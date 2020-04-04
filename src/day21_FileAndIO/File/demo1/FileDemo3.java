package day21_FileAndIO.File.demo1;

import java.io.File;

/*
 * 目录操作相关的方法
		public  boolean mkdir()  创建文件夹，如果存在这样的文件夹，就不创建了
		public  boolean mkdirs()  创建文件夹，如果父文件夹不存在，会帮你创建出来
		 - 如果创建文件或者文件夹忘了写盘符路径，默认在项目路径下
		public String[] list()  列出File对象的所有子文件名和路径名，返回String数组
		public File[] listFiles() 列出File对象的所有子文件和路径，返回File数组
 */
public class FileDemo3 {
	public static void main(String[] args) {

		// 1.创建文件夹
		File file = new File("小说//言情小说//张三都市生活");
		// file.mkdir();//创建单级目录
		file.mkdirs();// 创建多级目录

		System.out.println("---------------------------");

		File file2 = new File("C:\\");
		// 列出File对象的所有子文件名和路径名，返回String数组
		String[] list = file2.list();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("---------------------------");
		// 列出File对象的所有子文件和路径，返回File数组 推荐使用这种方式
		File[] listFiles = file2.listFiles();
		for (File file3 : listFiles) {
			String name = file3.getName();
			System.out.println(name);
		}
	}
}
