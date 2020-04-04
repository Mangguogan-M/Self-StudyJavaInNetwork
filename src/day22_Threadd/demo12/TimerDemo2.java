package day22_Threadd.demo12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ����ʱ������ĳ�����룬�����ظ�����ĳ������
 * 
 * ����Timer��TimerTask��������
 * 		Timer:��ʱ
 * 			public Timer()
			public void schedule(TimerTask task,long delay)   ��ָ���ӳٺ�ִ��ָ������
			public void schedule(TimerTask task,long delay,long period)   ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
			cancel()  ��ֹ�˼�ʱ�����������е�ǰ�Ѱ��ŵ�����
 * TimerTask:����
 * 
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ִ���ϲ��������һ�Σ�������ɹ���ÿ��2���ٽ��ϲ���
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

class MyTask2 extends TimerTask {

	@Override
	public void run() {
		System.out.println("�ϲ���������");
	}
}