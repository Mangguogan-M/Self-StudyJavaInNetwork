package day04;

/*
 * 编程实现位运算的使用  <<  >>  >>>
 */
public class TestBit {
	public static void main(String[] args) {

		// 表示5转换的二进制向左移动5位，右边补0
		System.out.println(5 << 5);// 160

		System.out.println(5 >> 1);// 0000 0010 =>2

		System.out.println(5 >>> 1);// 0000 0101 =>2

		/*
		 * -14>>>2 负的十进制转换位二进制 0000 1110 1111 0001 1111 0010
		 * 
		 * 0111 1001 0011 1100
		 *
		 * -14>>>2 11111111 11111111 11111111 11110010 0011111111 11111111 11111111
		 * 111100
		 *
		 */
		System.out.println(-14 >>> 2);

		System.out.println("-------------------------");

		System.out.println(5 & 8);// 按位与
		System.out.println(5 | 8);// 按位或 13
		System.out.println(5 ^ 8);// 按位或 13
		System.out.println(~8);// 按位非
		System.out.println(~-10);

	}
}
