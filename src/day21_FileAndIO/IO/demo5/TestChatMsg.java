package day21_FileAndIO.IO.demo5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ：使用PrintStream和BufferedReader类来生成聊天记录
			//要求不断地提示用户输入要发送的内容，判断是否为"bye"，若是则结束
			//输入，若不是则写入文件H:\\a.txt中
 */
public class TestChatMsg {
	public static void main(String[] args) {
		try {
			// System.in 是InputStream类型的，代表键盘输入
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(new FileOutputStream("H:\\a.txt"));
			boolean flg = true;
			while (true) {
				// 1.提示用户输入要发送的内容并记录到变量中
				System.out.println("请" + (flg ? "张三" : "李四") + "输入要发送的内容");
				String str = br.readLine();
				// 2.判断用户输入的内容是否为"bye",若是则结束输入
				if ("bye".equalsIgnoreCase(str)) {
					System.out.println("聊天结束!");
					break;
				}
				// 获取当前的系统时间
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String format = sdf.format(d);

				// 3.若不是则将用户输入的内容写入到文件a.txt中
				ps.println(format + (flg ? "张三：" : "李四：") + str);
				flg = !flg;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
