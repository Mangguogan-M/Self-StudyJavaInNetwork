package day06;

import java.util.Arrays;

/*
 * ��ʾ������ĸ���
 */
public class TestArrCopy {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		int[] arr1 = new int[10];

		// System.arraycopy(ԭ����,ԭ����Ҫ���Ƶ���ʼλ��,Ŀ������,��ʼλ��,���Ƴ���);
		System.arraycopy(arr, 0, arr1, 1, 5);
		// ͨ��Arrays.toString(��������) ͨ�����鹤����������������
		System.out.println(Arrays.toString(arr1));

		// ��ʽ�����鸳ֵ
		int[] arr2 = Arrays.copyOf(arr, 5);// ����arr����ǰ����Ԫ��
		System.out.println(Arrays.toString(arr2));

		// ��������� Arrays.copyof(arr,arr.length+1);// arr���鳤�ȼ�һ�����ݳ��Ȳ��̶���

		arr2 = Arrays.copyOf(arr, arr.length + 1);

		System.out.println(arr2.length);

	}

}
