package day06;

/*
 * ���ʵ��һά�����������ʹ��
 */
public class TestArr {

	public static void main(String[] args) {

		// 1.����һ������Ϊ5��Ԫ������Ϊint���͵�����
		int[] arr = new int[5];

		// 2.��ӡ������ÿ��Ԫ�ص�ֵ
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);//�����쳣
		// java.lang.ArrayIndexOutOfBoundsException: 5 �����±�Խ��

		// ��������.length ��ȡԪ�ظ���
		System.out.println(arr.length);
		System.out.println("-------------------");
		// �������е�ÿ��Ԫ�ؽ��и�ֵ
		/*
		 * arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
		 */

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println("------------------------");
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };// ����ʹ��
		// int[] arr3 = new int[5];//����ʹ��
		// int[] arr2 = new int[]{10,20,30,40,50};
		/*
		 * int[] arr3; arr3={1,3,5,7};
		 */ // Java�в�֧�����ַ�ʽ�����Ա�����㱨��

		System.out.println("����ĳ����ǣ�" + arr1.length);// 5

		// ��ӡ�����е�ÿ��Ԫ��
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		System.out.println("�������һ��Ԫ�ص�ֵ��" + arr1[arr1.length - 1]);

	}

}