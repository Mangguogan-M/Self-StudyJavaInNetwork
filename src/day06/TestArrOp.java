package day06;

import java.util.Arrays;

/*
 * ���ʵ��������Ԫ�ص����ӡ�ɾ�����޸ġ����ҹ���
 */
public class TestArrOp {
	public static void main(String[] args) {
		// 1.����һ������Ϊ5Ԫ������Ϊint���͵�һά����
		int[] arr = new int[5];

		// 2.�������±�Ϊ0~3��λ�ø�ֵ 10~40
		for (int i = 0; i < 4; i++) {
			arr[i] = (i + 1) * 10;
		}

		System.out.println(Arrays.toString(arr));

		System.out.println("----------------------");
		// ʵ�����������±�Ϊ0��λ�ò���Ԫ��50��ԭ����Ԫ������ƶ�
		for (int i = 4; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = 50;
		System.out.println(Arrays.toString(arr));

		// ʵ�������ɾ��
		// ���������±�Ϊ0��Ԫ��ɾ����Ҳ�����ú�����Ԫ����ǰ�ƶ�����λ��Ϊ0

		System.out.println("----------------------");
		// �����������Ƿ���Ԫ��Ϊ20�����������ӡ�±겢����Ԫ������Ϊ300

		for (int i = 0; i < arr.length; i++) {
			if (20 == arr[i]) {
				System.out.println("Ԫ��20���ڵ��±���:" + i);
				arr[i] = 300;
				// break; ��break �൱�ڲ��ҵ���һ��20 ��û��break�൱�ڲ��ҵ����е�20
			}
		}

		// ��ӡ����������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);

		}

	}
}
