package day22_Threadd.demo12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ָ��ʱ��ɾ��ָ��Ŀ¼
 */
public class TimerDemo3 {
	public static void main(String[] args) throws ParseException {
		// ������ʱ������
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
		// ʹ�õݹ�ɾ��Ŀ¼�������ļ��Լ�Ŀ¼
	}
}