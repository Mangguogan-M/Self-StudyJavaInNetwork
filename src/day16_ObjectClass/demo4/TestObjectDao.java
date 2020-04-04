package day16_ObjectClass.demo4;

public class TestObjectDao {
	public static void main(String[] args) {

		// 第二种情况
		ObjectDao<Integer> ob = new ObjectDaoImpl<Integer>();
		ob.show(123);

		ObjectDao<String> ob2 = new ObjectDaoImpl<String>();
		ob2.show("gkjhd");

	}
}
