package day06;

import java.util.Arrays;

/*
 * 编程实现数组中元素的增加、删除、修改、查找功能
 */
public class TestArrOp {
	public static void main(String[] args) {
		// 1.声明一个长度为5元素类型为int类型的一维数组
		int[] arr = new int[5];

		// 2.向数组下标为0~3的位置赋值 10~40
		for (int i = 0; i < 4; i++) {
			arr[i] = (i + 1) * 10;
		}

		System.out.println(Arrays.toString(arr));

		System.out.println("----------------------");
		// 实现向数组中下标为0的位置插入元素50，原来的元素向后移动
		for (int i = 4; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = 50;
		System.out.println(Arrays.toString(arr));

		// 实现数组的删除
		// 将数组中下标为0的元素删除，也就是让后续的元素向前移动最后的位置为0

		System.out.println("----------------------");
		// 查找数组中是否有元素为20，若存在则打印下标并将该元素设置为300

		for (int i = 0; i < arr.length; i++) {
			if (20 == arr[i]) {
				System.out.println("元素20所在的下标是:" + i);
				arr[i] = 300;
				// break; 有break 相当于查找到第一个20 ，没有break相当于查找到所有的20
			}
		}

		// 打印数组中所有元素
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);

		}

	}
}
