package day08;

/*
 * 定义一个boy类
 */
public class Boy {
	String name;

	Boy() {
		// 表示调用本类中的有有参构造
		// this(); 在无参构造中不要再去调用当前的无参构造，不然也是一样陷入死循环，编译器会直接提示报错。
		this("张三丰");
	}

	Boy(String name) {
		// this(); 表示调用本类中无参构造方法 如果出现无参中调用有参 ，那么在有参就不要调用无参
		// ，不然陷入死循环，因为编译器知道会发生这样的问题，所以提示报错。
		this.name = name;
		this.show();
	}

	void show() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Boy b = new Boy();
		b.show();
		System.out.println("--------------");
		Boy b2 = new Boy();

		System.out.println();
		// 表示引用b3不指向任何有效的对象
		Boy b3 = null;
		b3.show();// 编译的时候很ok，但是运行的时候很崩溃 error
	}

}
