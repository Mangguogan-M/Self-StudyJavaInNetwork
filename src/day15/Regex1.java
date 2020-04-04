package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 演示正则表达式用法
 */
public class Regex1 {
	public static void main(String[] args) {

		// 1.编写正则表达式，匹配abc中任意单个字符
		String reg = "[abc]$";

		// 2.编写正则表达式匹配abc中任意3个字符
		String reg1 = "[abc]{3}";

		// 3.编写正则表达式匹配字母数字，要求出现0或则1次
		String reg2 = "[a-zA-Z0-9]?";

		// 4.编写正则表达式匹配字母数字下划线
		String reg3 = "\\w";

		System.out.println("--------第一种匹配方式---------");
		boolean mc = "adc".matches(reg1);
		System.out.println(mc);

		boolean mc1 = "acc".matches(reg1);
		System.out.println(mc1);

		System.out.println("--------第二种匹配方式----------");
		boolean b = Pattern.matches(reg2, "9");
		System.out.println(b);

		System.out.println("--------第三种匹配方式----------");
		// compile(String regex) 将给定的正则表达式编译到模式中。

		// 将给定的正则表达式编译到模式中。
		Pattern pattern = Pattern.compile(reg3);
		// Matcher matcher(CharSequence input) 创建匹配给定输入与此模式的匹配器。
		// 创建匹配给定输入与此模式的匹配器
		Matcher matcher = pattern.matcher("6");
		// 尝试将整个区域与模式匹配
		boolean matches = matcher.matches();
		System.out.println(matches);

	}
}
