package day06;

/*
 * 编程实现    求出出数组中元素最大的值
 */
public class TestArrMax {
	public static void main(String[] args) {

		// 1.声明数组arr 存储5个元素int类型的,并赋值
		// int[] arr = new int[5];
		int[] arr = { 76, 89, 32, 99, 54 };

		int max = arr[0];// 99 假设第一个元素为最大值

		for (int i = 0; i < arr.length; i++) {// 遍历剩余数组
			if (arr[i] > max) {// 若剩余元素大于max
				max = arr[i];// 修改max的值为最大的
			}
		}

		System.out.println("最大值为:" + max);
	}
}
