package day16_ObjectClass.demo4;

/*
 * ʵ������ʵ�ֽӿڵ�ʱ�������ַ�ʽ
 * 		��һ��������Ѿ�֪����ʲô������
 */
/*public class ObjectDaoImpl implements ObjectDao<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}
}*/

/*
 * �ڶ��������
 * 		����֪��ʲô���ͣ�δ֪
 */
public class ObjectDaoImpl<T> implements ObjectDao<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}

}
