package day22_Threadd.demo12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ����ʱ������ĳ�����룬�����ظ�����ĳ������
 * 
 * ����Timer��TimerTask��������
 * 		Timer:��ʱ
 * 			public Timer()
			public void schedule(TimerTask taskF,long delay)   ��ָ���ӳٺ�ִ��ָ������
			public void schedule(TimerTask task,long delay,long period)   ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
			cancel()  ��ֹ�˼�ʱ�����������е�ǰ�Ѱ��ŵ�����
 * TimerTask:����
 * 
 */
public class TimerDemo {
	public static void main(String[] args) {
		//������ʱ������
		Timer t = new Timer();
		//3����ϲ���
//		t.schedule(new MyTask(), 3000);
		//��������
		t.schedule(new MyTask(t), 3000);
	}
}

class MyTask extends TimerTask{
	private Timer t;

	public MyTask(Timer t) {
		this.t=t;
	}

	@Override
	public void run() {
		System.out.println("�ϲ���������");
		t.cancel();
	}
	
}