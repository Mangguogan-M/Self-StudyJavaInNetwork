package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能：
	获取下面这个字符串中由三个字符组成的单词
	q xue wan gaoji wo gei ni men jie shao dui xiang,ni men ji bu ji dong?

 */
public class RegexCase {
	public static void main(String[] args) {
		// 定义字符串
		String str = "q xue wan gaoji wo gei ni men jie shao dui xiang,ni men ji bu ji dong?";

		// 1.创建正则表达式匹配三个字符组成的单词
		String reg = "\\b[a-zA-Z]{3}\\b";

		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(str);

		// find() 查找 与正则匹配的字符序列
		while (matcher.find()) {

			// 开始的索引/偏移量
			int start = matcher.start();
			// 结束的索引/偏移量
			int end = matcher.end();

			// 获取到查询的这一组数据
			String group = matcher.group();

			System.out.println(start + "  " + group + "  " + end);
		}
	}
}
