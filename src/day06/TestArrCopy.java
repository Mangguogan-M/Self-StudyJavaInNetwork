package day06;

import java.util.Arrays;

/*
 * 演示：数组的复制
 */
public class TestArrCopy {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		int[] arr1 = new int[10];

		// System.arraycopy(原数组,原数组要复制的起始位置,目标数组,起始位置,复制长度);
		System.arraycopy(arr, 0, arr1, 1, 5);
		// 通过Arrays.toString(数组名称) 通过数组工具类来便捷输出数组
		System.out.println(Arrays.toString(arr1));

		// 方式二数组赋值
		int[] arr2 = Arrays.copyOf(arr, 5);// 复制arr数组前六个元素
		System.out.println(Arrays.toString(arr2));

		// 数组的扩容 Arrays.copyof(arr,arr.length+1);// arr数组长度加一，扩容长度不固定的

		arr2 = Arrays.copyOf(arr, arr.length + 1);

		System.out.println(arr2.length);

	}

}
