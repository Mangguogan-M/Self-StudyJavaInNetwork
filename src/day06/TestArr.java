package day06;

/*
 * 编程实现一维数组的声明和使用
 */
public class TestArr {

	public static void main(String[] args) {

		// 1.声明一个长度为5的元素类型为int类型的数组
		int[] arr = new int[5];

		// 2.打印数组中每个元素的值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);//产生异常
		// java.lang.ArrayIndexOutOfBoundsException: 5 数组下标越界

		// 数组名称.length 获取元素个数
		System.out.println(arr.length);
		System.out.println("-------------------");
		// 给数组中的每个元素进行赋值
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
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };// 建议使用
		// int[] arr3 = new int[5];//建议使用
		// int[] arr2 = new int[]{10,20,30,40,50};
		/*
		 * int[] arr3; arr3={1,3,5,7};
		 */ // Java中不支持这种方式，所以编译给你报错

		System.out.println("数组的长度是：" + arr1.length);// 5

		// 打印数组中的每个元素
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		System.out.println("数组最后一个元素的值：" + arr1[arr1.length - 1]);

	}

}