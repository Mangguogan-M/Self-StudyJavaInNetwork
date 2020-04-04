package day25_Reflect.demo1;

/*
 * �����ȡClass��ʵ�������ַ�ʽ
 * 		��һ�ַ�ʽ��
 * 			���ö������getClass()������ȡ�ö����Classʵ��
 * 			����.getClass()
 * 			���磺Class cls = new Student().getClass();
 * 		�ڶ��ַ�ʽ��
 * 			����.class
 * 			���磺Class cls = Student.class;
 * 		�����ַ�ʽ:���ַ�ʽ�Ƚϳ���   �Ƽ�  һ�㿪����ʱ���������ַ�ʽ
 * 			ʹ��Class��ľ�̬����forName("����.����")����������ֻ�ȡһ��Classʵ����
 * 			Class.forName("ȫ�޶���");
 * 			���磺Class cls = Class.forName("entity.Student");
 */
public class Case1 {
	public static void main(String[] args) throws ClassNotFoundException {
		// ��ȡGoods����ʱ��
		// �����ֻ�ȡ��ʽ
		Class<?> cls = Class.forName("/src/day25_Reflect/demo1/Goods");
		// �ڶ��ַ�ʽ
		Class cls1 = Goods.class;
		// ��һ�ַ�ʽ
		// ȱ����봴�������������������࣬���û��ֱ�ӱ���
		Class<? extends Goods> cls2 = new Goods().getClass();

		// == �Ƚϵ��ǵ�ַ ��֤cls��cls1�Ƿ�ָ��ͬһ������
		System.out.println(cls == cls1);

		System.out.println(cls1 == cls2);

	}
}
