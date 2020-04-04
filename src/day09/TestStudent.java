package day09;

/*
 * 编写实现Student类的测试
 */
public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();

		System.out.println("--------------");
		Student s2 = new Student("如花", 18, 1);
		// 当子类中没有重写show()方法时，调用从父类中继承的show()方法
		// 当子类重写show()方法后，则调用子类重写后的show()方法
		s2.show();
	}
}
