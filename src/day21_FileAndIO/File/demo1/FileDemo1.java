package day21_FileAndIO.File.demo1;

import java.io.File;

/*
 * File类的创建
 * 
 * File(File parent, String child) 
          	根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
	File(String pathname) 
          	通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
	File(String parent, String child) 
          	根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 

 */
public class FileDemo1 {

	public static void main(String[] args) {

		// 第一种创建File的方式 File(String pathname) 推荐使用这种方式
		File file = new File("H:\\Java\\OOO\\老司机带带我.mp4");

		// 第二种方式 File(File parent, String child)
		File parent = new File("H:\\");
		File file1 = new File(parent, "Java\\OOO\\老司机带带我.mp4");

		// 第三种方式 File(String parent, String child)
		File file2 = new File("H:\\", "Java\\OOO\\老司机带带我.mp4");

	}
}
