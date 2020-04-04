package day11;

public class TestPersonStudent {
	public static void main(String[] args) {

		// 使用父类的引用指向父类自己的对象
		Person p = new Person();
		// 调用Person类自己的show()方法
		p.show();

		System.out.println("----------------------");
		// 使用子类的引用指向子类自己的对象
		Student s = new Student();
		// 当子类中没有show()方法的时候，则调用父类Person中的show()方法
		// 当子类中重写show()方法后，则调用子类Student自己的show()方法
		s.show();

		System.out.println("----------------------");
		// 使用父类的引用指向子类的对象，形成多态
		// 发生Student类型向Person类型的转换，小范围向大范围的转换，自动类型转换
		Person ps = new Student("zhangsan", 18, 1010);

		// 思考：ps调用的show()方法到底是Person类的还是Student类的？？？
		// 解析：在编译期间调用Person类的show(),在运行阶段调用Student的show()方法
		ps.show();

		System.out.println("----------------------");
		// 使用ps调用非静态的方法进行测试
		// ps是Person类型的引用，因此可以调用Person类自己的方法
		String str = ps.getName();
		System.out.println("获取到的姓名是：" + str);

		// ps.getId();//error
		System.out.println("----------------------");
		// 使用ps调用静态的方法进行测试，静态的成员推荐使用类名.的方式访问
		ps.test();// 警告
		Person.test();

		System.out.println("----------------------");
		// 如何去实现子类中方法的调用呢？？？
		// Person类型向Student类型进行转换， 大=>小,需要强制类型转换
		Student st = (Student) ps;
		int rs = st.getId();
		System.out.println("id=" + rs);

		// String sr = (String)ps; error
		// Teacher t = (Teacher)ps;//编译通过，运行产生类型转换异常
		// java.lang.ClassCastException: day11.Student cannot be cast to day11.Teacher

		// 判断ps真正指向的对象类型是否是Teacher类型，若是则返回true，否则返回false

		if (ps instanceof Teacher) {
			System.out.println("可以放心的进行强制类型转换了....");
		} else {
			System.out.println("不能进行强制类型转换");
		}

	}
}
