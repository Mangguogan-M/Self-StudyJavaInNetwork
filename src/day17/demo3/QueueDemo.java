package day17.demo3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		// 1.�������м���
		Queue q = new LinkedList<>();
		// offer ����
		q.offer("nihao");
		q.offer("hehe");
		q.offer("biubiubiu");

		// ��ȡͷ��Ԫ�ص����Ƴ�
		Object peek = q.peek();
		System.out.println(peek);

		// ��ȡͷ��Ԫ�ز��Ƴ�
		Object object2 = q.poll();
		System.out.println(object2);

		System.out.println("-------------------");
		for (Object object : q) {
			System.out.println(object);
		}

	}
}
