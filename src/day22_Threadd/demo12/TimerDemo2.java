package day22_Threadd.demo12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：可以让我们在指定的时间内做某件事请，还可重复的做某件事情
 * 
 * 依赖Timer和TimerTask这两个类
 * 		Timer:定时
 * 			public Timer()
			public void schedule(TimerTask task,long delay)   在指定延迟后执行指定任务
			public void schedule(TimerTask task,long delay,long period)   安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
			cancel()  终止此计时器，丢弃所有当前已安排的任务。
 * TimerTask:任务
 * 
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// 创建定时器对象
		Timer t = new Timer();
		// 3秒后执行上厕所任务第一次，如果不成功吗，每隔2秒再进上厕所
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

class MyTask2 extends TimerTask {

	@Override
	public void run() {
		System.out.println("上厕所。。。");
	}
}