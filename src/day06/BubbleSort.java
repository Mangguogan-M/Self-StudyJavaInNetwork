package day06;

import java.util.Arrays;

/*
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 5, 8, 2, 10, 9 };
		System.out.println("排序前数组为：");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {// 外层循环控制排序躺数
			for (int j = 0; j < arr.length - 1 - i; j++) {// 内层循环控制每一次排序多少次

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

		System.out.println("排序后的数组：");
		System.out.println(Arrays.toString(arr));

	}
}
