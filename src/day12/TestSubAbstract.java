package day12;

public class TestSubAbstract extends TestAbstract {

	public static void main(String[] args) {

		// 子类的引用指向子类自己的对象
		TestSubAbstract ts = new TestSubAbstract();
		// 子类的引用只能调用自己的show()方法
		ts.show();

		System.out.println("---------------");
		// 父类的引用指向子类的对象，形成多态
		TestAbstract ta = new TestSubAbstract();
		// 在编译阶段调用父类的show()方法，在运行阶段调用子类重写父类以后的方法
		ta.show();

	}

	@Override
	public void show() {
		System.out.println("抽象类果真厉害！");
	}

}
