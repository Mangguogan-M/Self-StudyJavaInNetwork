package day26_JDK8.demo2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * JDK8还新增了forEachRemaining(Consumer action)方法，该方法所需要的Consumer参数同样是函数式接口。
 * 当程序调用Iterator的forEachRemaining(Consumer action)遍历集合元素。
 * 程序会一次将集合元素传递给Consumer的accept(T t)方法(该接口中唯一的抽象方法)
 */
public class TestLambdaIterrator {

	public static void main(String[] args) {

		Collection<String> c = new HashSet<>();
		c.add("西门庆");
		c.add("武大郎");
		c.add("小潘");
		Iterator<String> iterator = c.iterator();
		iterator.forEachRemaining(System.out::println);

	}

}
