package day06;

/*
 * ���ʵ��    �����������Ԫ������ֵ
 */
public class TestArrMax {
	public static void main(String[] args) {

		// 1.��������arr �洢5��Ԫ��int���͵�,����ֵ
		// int[] arr = new int[5];
		int[] arr = { 76, 89, 32, 99, 54 };

		int max = arr[0];// 99 �����һ��Ԫ��Ϊ���ֵ

		for (int i = 0; i < arr.length; i++) {// ����ʣ������
			if (arr[i] > max) {// ��ʣ��Ԫ�ش���max
				max = arr[i];// �޸�max��ֵΪ����
			}
		}

		System.out.println("���ֵΪ:" + max);
	}
}
