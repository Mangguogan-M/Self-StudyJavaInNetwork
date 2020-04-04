package day14;

public class TestStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1);// 调用toString() hello
		System.out.println("容量：" + sb1.capacity());// 21 =16 + 5;
		System.out.println("字符个数是：" + sb1.length());

		System.out.println("--------------------");
		// 实现向字符串对象sb1中插入指定的字符串内容
		// StringBuilder sb2 = sb1.insert(-1, "abcd");//编译ok 运行产生异常

		// StringBuilder类描述的字符序列本身可以改变
		StringBuilder sb2 = sb1.insert(0, "abcd");
		System.out.println(sb2);// abcdhello
		System.out.println(sb1);// abcdhello

		// String类描述的字符序列本身不会改变
		String s1 = "hello";
		String s2 = s1.toUpperCase();
		System.out.println(s1);// hello
		System.out.println(s2);// HELLO

		System.out.println("----------------");
		sb1.insert(4, "1234");
		// 字符串末尾追加内容
		StringBuilder sb3 = sb1.append("world");
		System.out.println(sb1);
		System.out.println(sb3);

		// 当插入的字符串超过初始容量的时候，则会自动扩大容量。
		System.out.println("容量：" + sb1.capacity());// 21 =16 + 5;
		System.out.println("字符个数是：" + sb1.length());

		System.out.println("--------------------");
		// 实现字符串内容的删除 "hello"移除
		sb1.delete(8, 13);
		System.out.println(sb1);

		System.out.println("--------------------");
		// 实现字符串中内容的修改，“abcd”替换为ABCD
		sb1.replace(0, 4, "ABCD");
		System.out.println(sb1);

		System.out.println("---------------------");
		// 字符串的反转
		sb1.reverse();
		System.out.println(sb1);

		System.out.println("----------------------");
		// 实现StringBuilder类型向String类型的转换
		// String s3 = new String(sb1);
		String s3 = sb1.toString();
		System.out.println(s3);
		// 实现String类型向StringBuilder类型转换
		StringBuilder sb4 = new StringBuilder(s3);
		System.out.println(sb4);

	}
}
