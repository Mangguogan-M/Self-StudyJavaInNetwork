package day21_FileAndIO.File.demo1;

import java.io.File;
import java.io.IOException;

/*
 * 文件操作相关的方法
	public  boolean createNewFile()   创建文件如果存在这样的文件，就不创建了
	public  boolean delete()  Java中的删除不走回收站，要删除一个文件夹，注意文件夹内不能包含文件或文件夹
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		// 1.创建文件 如果不指定路径 默认在项目下创建
		File file = new File("言情.txt");
		// 2.创建文件
		boolean b = file.createNewFile();
		if (b) {
			System.out.println("创建成功");
		}

		// 3.删除文件
		boolean delete = file.delete();
		if (delete) {
			System.out.println("删除成功");
		}

	}
}
