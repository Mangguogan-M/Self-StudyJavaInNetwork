package day06;

import java.util.Arrays;

/*
 * ð������
 */
public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 5, 8, 2, 10, 9 };
		System.out.println("����ǰ����Ϊ��");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {// ���ѭ��������������
			for (int j = 0; j < arr.length - 1 - i; j++) {// �ڲ�ѭ������ÿһ��������ٴ�

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

		System.out.println("���������飺");
		System.out.println(Arrays.toString(arr));

	}
}
