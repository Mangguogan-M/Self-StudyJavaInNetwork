package day14;

public class TestStringCharAt {
	public static void main(String[] args) {
		// 使用无参构造来创建对象
		String s1 = new String();
		int len = s1.length();
		System.out.println("len = " + len);

		System.out.println("---------------------");
		// 使用有参构造方法来构造对象
		String s2 = new String("hello");
		len = s2.length();
		System.out.println("len = " + len);

		// 使用charAt()方法来获取里面的单个字符
		// char cv = s2.charAt(-1); 产生字符串下标越界异常
		char cv = s2.charAt(0);
		System.out.println(cv);// h

		cv = s2.charAt(4);
		System.out.println(cv);// o

		System.out.println("------------------");
		// 打印字符串中的所有字符
		for (int i = 0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}

	}
}
