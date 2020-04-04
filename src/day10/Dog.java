package day10;

/*
 * 狗类
 */
public class Dog extends Animal {

	// 无参构造
	public Dog() {
		super();// 调用父类无参构造
	}

	// 有参构造
	public Dog(String name, int age) {
		/*
		 * setAge(age); setName(name);
		 */
		super(name, age);// 调用父类有参构造进行初始化
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	// @Override
	public void show2() {
		// System.out.println(getAge()+" "+getName());
		show();// 调用父类的方法 error 调用自己的方法进入无限循环模式,提示栈溢出
	}

}
