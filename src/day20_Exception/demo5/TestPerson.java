package day20_Exception.demo5;

public class TestPerson {
	public static void main(String[] args) {

		Person p = null;
		try {
			p = new Person("zhangfei", -12);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p);

	}
}
