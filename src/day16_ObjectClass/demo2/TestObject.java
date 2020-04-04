package day16_ObjectClass.demo2;

/*
 * 早期的时候，我们使用Object代表任意类型
 */
public class TestObject {
	public static void main(String[] args) {

		ObjectBean<String> ob = new ObjectBean<String>();
		ob.setT("张三:李四你小子最近很飘。");
		String str = (String) ob.getT();
		System.out.println(str);

		/*
		 * ob.setT("李四：张三我本来就很飘，你也可以飘一个。"); Integer i = (Integer) ob.getT();
		 * System.out.println(i);
		 */

	}
}
