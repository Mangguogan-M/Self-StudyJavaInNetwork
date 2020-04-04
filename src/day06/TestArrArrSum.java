package day06;

/*
 * 公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99
 */
public class TestArrArrSum {
	public static void main(String[] args) {

		// 声明一个二维数组存储每个季度的数据
		int[][] arr = { { 22, 66, 44 }, { 77, 33, 88 }, { 25, 45, 65 }, { 11, 66, 99 } };

		// 公司年销售额求和

		// 声明一个int类型的遍历 sum 来存储年销售总额
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];// sum = sum+arr[i][j];

			}
		}

		System.out.println("公司年销售额是：" + sum);

	}
}
