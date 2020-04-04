package day21_FileAndIO.File.demo1;

import java.io.File;
import java.text.SimpleDateFormat;

/*
 * 基本获取功能
		public String getAbsolutePath()  获取绝对路径
		public String getPath()  获取相对路径
		public String getName()  获取名称
		public long length()  获取长度，字节数
		public long lastModified()  获取最后一次修改时间，毫秒值
	重命名
		public  boolean renameTo(File dest)
 * 
 */
public class FileDemo5 {
	public static void main(String[] args) {

		File file = new File("H:\\Java\\OOO\\Jack马.mp4");
		// 获取绝对路径
		String absolutePath = file.getAbsolutePath();
		// 获取相对路径
		String path = file.getPath();
		// 获取名称
		String name = file.getName();
		// 获取长度，字节数
		long length = file.length();
		// 最后一次修改时间，毫秒值
		long lastModified = file.lastModified();

		System.out.println("绝对路径:" + absolutePath);
		System.out.println("相对路径:" + path);
		System.out.println("名称:" + name);
		System.out.println("长度:" + length);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(lastModified);

		System.out.println("修改时间:" + format);

		System.out.println("-------------------------");
		/*
		 * 重命名 public boolean renameTo(File dest)
		 */

		/*
		 * 如果路径名相同，就是改名 如果路径名不同，就是改名剪切 路径以盘符开始：绝对路径 H:\\ 路径不以盘符开始:相对路径 xx.mp4
		 */
		File newFile = new File("xxx马.mp4");
		newFile.renameTo(file);

	}
}
