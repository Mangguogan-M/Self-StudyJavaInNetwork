package day14;

public class TestStringIndexOf {
	public static void main(String[] args) {

		// 1.构造字符串对象
		String s1 = new String("Good Good Study,Day Day Up!");

		// 2.查找字符串的内容
		// 查找单个字符在该字符串中的索引位置并返回
		int pos = s1.indexOf('g');
		System.out.println(pos);// -1

		pos = s1.indexOf('G');
		System.out.println(pos);// 0

		// 从指定位置查询字符出现的下标位置
		pos = s1.indexOf('G', 0);
		System.out.println(pos);// 0

		pos = s1.indexOf('G', 1);
		System.out.println(pos);// 5

		System.out.println("-------------------------");
		// 查找单个字符串在该字符串中的索引位置并返回
		pos = s1.indexOf("day");
		System.out.println(pos);

		pos = s1.indexOf("Day");
		System.out.println(pos);// 16

		pos = s1.indexOf("Day", 16);
		System.out.println(pos);// 16

		pos = s1.indexOf("Day", 17);
		System.out.println(pos);// 20

		// 当下标不存在并没有发生异常，而是返回 -1
		pos = s1.indexOf("Day", 27);
		System.out.println(pos);

		System.out.println("------------------------");
		// 使用lastIndeOf()方法查找该字符最后一次出现的索引位置
		// Good Good Study,Day Day Up!
		pos = s1.lastIndexOf('D');
		System.out.println(pos);// 20

		pos = s1.lastIndexOf('D', 20);
		System.out.println(pos);// 20
		pos = s1.lastIndexOf('D', 19);
		System.out.println(pos);// 16

		pos = s1.lastIndexOf('D', 15);
		System.out.println(pos);// -1

		System.out.println("------------------");
		// 使用lastIndexOf()方法查找字符串最后一次出现的索引位置
		// Good Good Study,Day Day Up!
		pos = s1.lastIndexOf("Good");
		System.out.println(pos);// 5

		pos = s1.lastIndexOf("Good", 5);
		System.out.println(pos);// 5

		pos = s1.lastIndexOf("Good", 4);
		System.out.println(pos);// 0

		pos = s1.lastIndexOf("Good", -1);
		System.out.println(pos);// -1

		System.out.println("--------------------");
		// 获取当前字符串中指定下标位置的子字符串
		// Good Good Study,Day Day Up!
		String s2 = s1.substring(3);
		System.out.println(s2);
		System.out.println(s1);

		// 包括4 不包括10 取头不取尾
		String s3 = s1.substring(4, 10);
		System.out.println(s3);// Good
		System.out.println(s1);// Good Good Study,Day Day Up!

	}
}
