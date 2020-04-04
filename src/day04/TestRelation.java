package day04;

import java.util.Scanner;

/*
 * 编程实现关系运算符的使用		>、<、==、<=、!=、>=
 */
public class TestRelation {

	public static void main(String[] args) {

		int ia = 5;
		int ib = 2;

		boolean flg = ia > ib;
		System.out.println(flg);// true

		System.out.println(ia > ib);// true
		System.out.println(ia < ib);// false
		System.out.println(ia <= ib);// false 小于等于 小于或者等于
		System.out.println(ia >= ib);// true 大于等于 大于或者等于
		System.out.println(ia != ib);// true
		System.out.println(ia == ib);// false

		System.out.println("---------------");
		// 判断ia变量中记录的整数是否为两位数整数 10~99
		// System.out.println( 10 <= ia <=99 );//error ：二元运算符 错误 不支持这种语法格式
		// 等会讲逻辑运算符来处理

		// 提示用户输入一个整数，并判断该整数是否为负数，若是则打印true 否则 false

		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		System.out.println(num < 0);

	}

}
