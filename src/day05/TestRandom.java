package day05;

import java.util.Random;

/*
 * ���ʵ�������������
 */
public class TestRandom {
	public static void main(String[] args) {

		// ���������Ķ���
		Random r = new Random();

		// ���ɵ������ 1~100֮�������
		int num = r.nextInt(100) + 1;

		System.out.println("���ɵ�������ǣ�" + num);
	}
}
