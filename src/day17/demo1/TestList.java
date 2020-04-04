package day17.demo1;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// 获取List/Collection集合的引用
		// List list = new List(); error 接口不能构造对象

		// 接口类型的引用指向实现类的对象，形成了多态
		List c1 = new ArrayList();

		// 向集合c1中添加元素
		boolean b1 = c1.add(new Integer(1));
		System.out.println("b1 = " + b1);

		// 自动调用toString(),编译器自动添加
		// 在编译阶段调用父类的方法，在运行阶段调用子类重写以后的方法，ArrayList类
		// toString()默认打印的格式伟：[元素1,元素2,.....]
		System.out.println(c1);

		b1 = c1.add(new String("two"));
		System.out.println(b1);
		System.out.println("c1 = " + c1);// [1,two]

		b1 = c1.add(new Student(1001, "zhangsan", 30));
		System.out.println(b1);
		System.out.println("c1 = " + c1);
		System.out.println("---------------------------");
		// addAll() 将指定集合中的元素添加到调用该方法的集合中
		// 准备另一个集合
		List c2 = new ArrayList();
		c2.add(3);// 采用了自动装箱技术 int=>Integer
		System.out.println("c2 =" + c2);
		c2.add("four");
		System.out.println("c2 =" + c2);
		System.out.println("当前集合的元素个数是：" + c2.size());// 2
		System.out.println("当前集合的元素个数是：" + c1.size());// 3

		System.out.println("----------------------------");
		// 将集合c2中所有的元素添加到集合c1中。
		b1 = c1.addAll(c2);
		System.out.println("b1 =" + b1);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

		System.out.println("---------------------------");
		// 4. contains(Object o) 判断集合中是否包含参数指定的单个元素
		// 5. containsAll(Collection<?> c) 表示判断集合中是否包含指定元素的整体

		// 判断集合c1中是否包含参数指定的单个元素
		b1 = c1.contains(new Integer(1));
		System.out.println("b1 = " + b1);
		b1 = c1.contains(new Integer(2));
		System.out.println("b1 = " + b1);
		b1 = c1.contains(new String("two"));
		System.out.println("b1 = " + b1);

		// contains方法的原理：参数对象调用equals()方法与集合中的元素一个一个比较
		// 当Student类，没有重写equals()方法时候，则比较的是地址，因此返回结果false
		// 当Student类，重写equals()方法时候，则比较对象的内容，返回结果true
		b1 = c1.contains(new Student(1001, "zhangsan", 30));
		System.out.println("b1 = " + b1);

		System.out.println("---------------------------");

		// 将集合c2中的元素一个个拿出来与c1中进行比较
		b1 = c1.containsAll(c2);
		System.out.println("b1 =" + b1);// true

		//// 判断集合c1中是否包含c2这个整体
		b1 = c1.contains(c2);// false
		System.out.println("b1 =" + b1);

		System.out.println("---------------------------");
		/*
		 * 6. remove(int index) 移除列表中指定位置的元素 7. removeAll(Collection<?> c) 从列表中移除指定
		 * collection 中包含的其所有元素
		 */

		// 实现集合c1中单个元素的删除
		b1 = c1.remove(new String("2"));
		System.out.println("b1 =" + b1);

		b1 = c1.remove(new String("two"));
		System.out.println("b1 =" + b1);
		System.out.println("c1 =" + c1);
		System.out.println("---------------------------");
		// 实现集合c1中多个元素的删除
		// 表示从集合c1中将集合c2中元素一个一个删除
		b1 = c1.removeAll(c2);
		System.out.println(b1);

		b1 = c1.remove(c2);
		System.out.println(b1);
		System.out.println(c1);

		System.out.println("---------------------------");

		// 实现集合c1中所有元素的删除
		/*
		 * c1.clear(); System.out.println("c1 ="+c1); System.out.println(c1.isEmpty());
		 * System.out.println(c1.size());
		 */

		System.out.println("---------------------------");
		// set(int index, E element)
		System.out.println("c1=" + c1);
		c1.set(0, "你好");
		System.out.println("c1=" + c1);

		System.out.println("-----------------------------");
		// 将集合转换为数组
		Object[] array = c1.toArray();

		System.out.println("----------------------");
		System.out.println("c1=" + c1);

		// 计算c1和c2的交集并保留到c1中，若c1集合中的内容发生了改变返回true
		b1 = c1.retainAll(c2);
		System.out.println("b1=" + b1);
		System.out.println(c1);

		System.out.println("------------------");
		System.out.println(c2);

		// 计算两个集合的交集并保留到当前集合中
		// 计算c2和c2的交集并保留到c2中，c2中的内容不发生改变，因此返回false；
		b1 = c2.retainAll(c2);
		System.out.println("b1 =" + b1);// false
		System.out.println(c2);
	}
}
