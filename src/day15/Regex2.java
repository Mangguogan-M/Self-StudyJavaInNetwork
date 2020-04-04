package day15;

/*
 *  1.验证用户名 字母开头4-6为数字字母下划线
	2.手机号11位
	3.验证QQ号码	  5-13位
	4.验证邮箱
	5.验证身份证
	6.验证用户2-4位汉字
	7.验证用户名	数字字母 必须都包含
 */
public class Regex2 {
	public static void main(String[] args) {

		// 1.验证用户名 字母开头4-6为数字字母下划线
		String reg = "^[a-zA-Z]\\w{3,5}";
		boolean matches = "s6_a".matches(reg);
		System.out.println(matches);

		// 4.验证邮箱
		// wanghd@126.com 91282345@qq.com
		String reg2 = "^[1-9a-zA-Z]+@\\w+(.com|.cn|.com.cn)$";
		boolean matches2 = "wanghd@126.com".matches(reg2);
		System.out.println(matches2);

		// 6.验证用户2-4位汉字
		String reg3 = "[\u4e00-\u9fa5]{2,4}";
		boolean matches3 = "你可以的".matches(reg3);
		System.out.println(matches3);

		// 7.验证用户名 数字字母 必须都包含
		// ?![0-9]$ ?![a-zA-Z]$
		String reg4 = "(?![0-9]+$)(?![a-zA-Z]+$)[0-9a-zA-Z]*";
		boolean matches4 = "dsdsa1dasa".matches(reg4);
		System.out.println(matches4);

		// 必须包含 数字 字母 下划线
		String reg5 = "(?![0-9]+$)(?![a-zA-Z]+$)(?![0-9a-zA-Z]+$)[0-9a-zA-Z_]*";
		boolean matches5 = "dsdsa_1dasa".matches(reg5);
		System.out.println(matches5);
	}
}
