package day06;

/*
 * ��˾�����۶����
	ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
	��һ���ȣ�22,66,44
	�ڶ����ȣ�77,33,88
	�������ȣ�25,45,65
	���ļ��ȣ�11,66,99
 */
public class TestArrArrSum {
	public static void main(String[] args) {

		// ����һ����ά����洢ÿ�����ȵ�����
		int[][] arr = { { 22, 66, 44 }, { 77, 33, 88 }, { 25, 45, 65 }, { 11, 66, 99 } };

		// ��˾�����۶����

		// ����һ��int���͵ı��� sum ���洢�������ܶ�
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];// sum = sum+arr[i][j];

			}
		}

		System.out.println("��˾�����۶��ǣ�" + sum);

	}
}
