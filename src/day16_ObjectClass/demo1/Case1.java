package day16_ObjectClass.demo1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 利用ArrayList存储字符串元素
 * 	
 * 		一个软件如果能出问题，尽可能让他早出问题。
 * 
 * 		String[] s = new String[3];
 * 		s[0] = "武大郎";
 * 		s[1] = "潘金莲";
 * 		s[2] = 666;
 * 
 * 		
 * 		泛型：是一种把类型明确的工作推迟到创建对象或调用方法的时候才去明确的特殊类型
 * 		又称之为参数化类型，把类型当作参数一样传递。
 * 
 * 
 * 		语法格式：
 * 			<数据类型>
 * 			此处的数据类型只能是引用数据类型/类类型
 * 
 * 
 * 		泛型好处：
 * 			1.将运行期间的问题提到了编译期间
 * 			2.避免了强制类型转换
 * 			3.优化了程序设计，解决了黄色警告线
 */
public class Case1 {

	public static void main(String[] args) {
		// 1.声明一个ArrayList集合
		ArrayList<String> list = new ArrayList<String>();
		// 2.向集合中添加字符串元素
		list.add("这是一个字符串");
		list.add("这好像也是一个字符串");
		// list.add(666);

		// 3.遍历集合
		// 集合依赖于我们的迭代器，集合是什么类型，迭代器就是什么类型
		Iterator<String> iterator = list.iterator();

		// hasNext 检查是否有元素
		while (iterator.hasNext()) {
			// String str = (String) iterator.next();
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
