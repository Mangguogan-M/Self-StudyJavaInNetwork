package day17.demo3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		// 1.创建队列集合
		Queue q = new LinkedList<>();
		// offer 插入
		q.offer("nihao");
		q.offer("hehe");
		q.offer("biubiubiu");

		// 获取头部元素但不移除
		Object peek = q.peek();
		System.out.println(peek);

		// 获取头部元素并移除
		Object object2 = q.poll();
		System.out.println(object2);

		System.out.println("-------------------");
		for (Object object : q) {
			System.out.println(object);
		}

	}
}
