package day14;

/*
 *  boolean contains(CharSequence s)  - 用于判断调用对象中是否包含参数指定的内容
	boolean endsWith(String suffix)  
	boolean startsWith(String prefix)  
								- 用于判断当前字符串是否以参数指定的内容为开头
	String toLowerCase()  - 用于将当前字符串中所有的字符转换为小写并返回
	String toUpperCase()  -  用于将当前字符串中所有的字符转换为大写并返回
	String trim()   - 用于去除当前字符串中两端的空白字符并返回。
 */
public class TestStringManyMethod {
	public static void main(String[] args) {

		String s1 = new String("   let me give you some Color to see see! ");
		// 测试String类中相关的方法
		// 判读当前字符串中是否包含指向参数的内容， 注意大小写
		System.out.println(s1.contains(new String("Some")));// false
		System.out.println(s1.contains(new String("some")));// true

		System.out.println("------------------------");
		// 判断当前字符串是否以 let开头 以及 以see!
		System.out.println(s1.startsWith("let"));// false
		System.out.println(s1.endsWith("see!"));// true

		System.out.println("------------------------");
		// 将当前字符串中所有的字符转换为大写以及小写
		// 当进行字符串大小写转换的时候，会创建新的字符串，原来的字符串内容保持不变
		// LET ME GIVE YOU SOME COLOR TO SEE SEE!
		String s2 = s1.toUpperCase();
		System.out.println(s2);

		System.out.println(s1);

		String s3 = s2.toLowerCase();
		System.out.println(s3);

		System.out.println("------------------------");
		// 去除字符串两端的空白字符
		String s4 = s1.trim();
		System.out.println(s4);

		System.out.println(s1);

	}
}
