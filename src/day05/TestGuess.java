package day05;

import java.util.Random;
import java.util.Scanner;

/*
 * ���ʵ�ֲ�������Ϸ
 */
public class TestGuess {

	public static void main(String[] args) {
		// ���������Ķ���
		Random r = new Random();

		// ���ɵ������ 1~100֮�������
		int num = r.nextInt(100) + 1;
		System.out.println(num);

		for (;;) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();

			if (a == num) {
				System.out.println("�¶���");
				break;
			} else {
				System.out.println("�´���");
			}

		}

	}
}
