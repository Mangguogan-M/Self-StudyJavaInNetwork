package day16_ObjectClass.demo2;

/*
 * ���ڵ�ʱ������ʹ��Object������������
 */
public class TestObject {
	public static void main(String[] args) {

		ObjectBean<String> ob = new ObjectBean<String>();
		ob.setT("����:������С�������Ʈ��");
		String str = (String) ob.getT();
		System.out.println(str);

		/*
		 * ob.setT("���ģ������ұ����ͺ�Ʈ����Ҳ����Ʈһ����"); Integer i = (Integer) ob.getT();
		 * System.out.println(i);
		 */

	}
}
