package day14;

/*
 * byte[] getBytes()  - 用于将当前字符串内容转换为byte数组并返回  
   char[] toCharArray()  - 用于将当前字符串内容转换为char数组并返回
 */
public class TestStringByteChar {
	public static void main(String[] args) {

		// 1.准备一个字符串对象
		String s1 = new String("GoodMorning!");

		// 2.将该字符串对象转换char数组并打印
		char[] arr = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---------------");
		// 3.将字符串对象转换为byte类型的数组对象
		byte[] by = s1.getBytes();
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);// ASCII 71 111 111 .....
		}

		System.out.println("----------------");
		// 4.使用静态方法valueOf将字符数组转换为String类型
		String s2 = String.valueOf(arr);
		System.out.println(s2);

		// 5.使用构造方法将字符串数组转换为String类型
		String str = new String(arr);
		System.out.println(str);

	}
}
