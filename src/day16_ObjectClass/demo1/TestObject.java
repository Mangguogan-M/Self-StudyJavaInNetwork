package day16_ObjectClass.demo1;

/*
 * ���ڵ�ʱ������ʹ��Object������������
 */
public class TestObject {
	public static void main(String[] args) {

		ObjectBean ob = new ObjectBean();
		ob.setObj("����:������С�������Ʈ��");
		String str = (String) ob.getObj();
		System.out.println(str);

		ob.setObj("���ģ������ұ����ͺ�Ʈ����Ҳ����Ʈһ����");
		Integer i = (Integer) ob.getObj();
		System.out.println(i);

	}
}
