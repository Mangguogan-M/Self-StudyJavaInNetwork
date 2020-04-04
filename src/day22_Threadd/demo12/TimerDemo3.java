package day22_Threadd.demo12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：在指定时间删除指定目录
 */
public class TimerDemo3 {
	public static void main(String[] args) throws ParseException {
		// 创建定时器对象
		Timer t = new Timer();
		String s = "2018-10-10 12:12:12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf.parse(s);
		t.schedule(new MyTask3(), parse);
	}
}

class MyTask3 extends TimerTask {

	@Override
	public void run() {
		// 使用递归删除目录下所有文件以及目录
	}
}