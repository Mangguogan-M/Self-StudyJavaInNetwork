package day06;

/*
 * ��ʾ����ά�����ʹ��
 */
public class TestArrArr {
	public static void main(String[] args) {

		// 1.����һ��2��3�еĶ�ά����
		int[][] arr = new int[2][3];

		// ��ζԶ�ά������и�ֵ
		// System.out.println(arr[0][0]);

		// ��α�����ά����
		// arr.length ���� ��Ҳ����˵�ж��ٸ�һά����
		for (int i = 0; i < arr.length; i++) {

			// arr[i].length ������Ҳ����˵ÿ��һά�����е�Ԫ�ظ���
			for (int j = 0; j < arr[i].length; j++) {
				// arr[i][j] ����ÿһ��һά������ÿһ��Ԫ��
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("-------------------");

		// arr[0]
		// ��ά����ĳ�ʼ��
		int[][] arr2 = { { 1, 3, 5, 7 }, { 2, 4, 6 }, { 8, 9, 10, 11, 15 } };
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("��" + (i + 1) + "��Ԫ�صĸ�����:" + arr2[i].length);
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);

			}
		}

	}
}
