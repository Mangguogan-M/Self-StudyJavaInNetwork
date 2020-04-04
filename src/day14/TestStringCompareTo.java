package day14;

public class TestStringCompareTo {
	public static void main(String[] args) {

		String s1 = new String("abc");

		// 调用compareTo()方法实现字符串大小的比较
		System.out.println(s1.compareTo("bcd"));// 负数 -1 'a' - 'b'
		System.out.println(s1.compareTo("abe"));// 负数 -2 'c' - 'e'
		System.out.println(s1.compareTo("abcdef"));// 负数 -3 3-6

		System.out.println("--------------------------");
		// 对应位置的字符串做减法，若所有字符相同则用长度做减法
		System.out.println(s1.compareTo("aaa"));// 正数 1 'b' - 'a'
		System.out.println(s1.compareTo("aba"));// 正数2 'c' - 'a'
		System.out.println(s1.compareTo("")); // 正数3 3-0

		System.out.println("--------------------------");
		// 'a' 97 A '65'
		System.out.println(s1.compareTo("Abc")); // 正数32
		System.out.println(s1.compareToIgnoreCase("Abc"));// 0

	}
}
