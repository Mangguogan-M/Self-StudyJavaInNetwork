package day16_ObjectClass.demo4;

public class TestObjectDao {
	public static void main(String[] args) {

		// �ڶ������
		ObjectDao<Integer> ob = new ObjectDaoImpl<Integer>();
		ob.show(123);

		ObjectDao<String> ob2 = new ObjectDaoImpl<String>();
		ob2.show("gkjhd");

	}
}
