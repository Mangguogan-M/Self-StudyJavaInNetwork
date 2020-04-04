package day06;

/*
 * 演示：二维数组的使用
 */
public class TestArrArr {
	public static void main(String[] args) {

		// 1.声明一个2行3列的二维数组
		int[][] arr = new int[2][3];

		// 如何对二维数组进行赋值
		// System.out.println(arr[0][0]);

		// 如何遍历二维数组
		// arr.length 行数 ，也就是说有多少个一维数组
		for (int i = 0; i < arr.length; i++) {

			// arr[i].length 列数，也就是说每个一维数组中的元素个数
			for (int j = 0; j < arr[i].length; j++) {
				// arr[i][j] 代表每一个一维数组中每一个元素
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("-------------------");

		// arr[0]
		// 二维数组的初始化
		int[][] arr2 = { { 1, 3, 5, 7 }, { 2, 4, 6 }, { 8, 9, 10, 11, 15 } };
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("第" + (i + 1) + "行元素的个数是:" + arr2[i].length);
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);

			}
		}

	}
}
