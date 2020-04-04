package day15;

/*
 * 替换功能
		public String replaceAll(String regex,String replacement)
		使用给的replacement 替换此字符串所有匹配给定的正则表达式的子字符串。

 */
public class RegexReplaceAll {
	public static void main(String[] args) {

		// 定义一个字符串
		String str = "dsadsa12345dhsakjdh1231";

		// 需求：去掉所有的数字，用*给替换掉
		// String reg = "\\d"; 将单个数字替换成一个指定字符
		String reg2 = "\\d+"; // 将一组数字替换成一个指定字符

		String string = str.replaceAll(reg2, "*");
		System.out.println(string);

	}
}
