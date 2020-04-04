package day14;

/*
 *  boolean contains(CharSequence s)  - �����жϵ��ö������Ƿ��������ָ��������
	boolean endsWith(String suffix)  
	boolean startsWith(String prefix)  
								- �����жϵ�ǰ�ַ����Ƿ��Բ���ָ��������Ϊ��ͷ
	String toLowerCase()  - ���ڽ���ǰ�ַ��������е��ַ�ת��ΪСд������
	String toUpperCase()  -  ���ڽ���ǰ�ַ��������е��ַ�ת��Ϊ��д������
	String trim()   - ����ȥ����ǰ�ַ��������˵Ŀհ��ַ������ء�
 */
public class TestStringManyMethod {
	public static void main(String[] args) {

		String s1 = new String("   let me give you some Color to see see! ");
		// ����String������صķ���
		// �ж���ǰ�ַ������Ƿ����ָ����������ݣ� ע���Сд
		System.out.println(s1.contains(new String("Some")));// false
		System.out.println(s1.contains(new String("some")));// true

		System.out.println("------------------------");
		// �жϵ�ǰ�ַ����Ƿ��� let��ͷ �Լ� ��see!
		System.out.println(s1.startsWith("let"));// false
		System.out.println(s1.endsWith("see!"));// true

		System.out.println("------------------------");
		// ����ǰ�ַ��������е��ַ�ת��Ϊ��д�Լ�Сд
		// �������ַ�����Сдת����ʱ�򣬻ᴴ���µ��ַ�����ԭ�����ַ������ݱ��ֲ���
		// LET ME GIVE YOU SOME COLOR TO SEE SEE!
		String s2 = s1.toUpperCase();
		System.out.println(s2);

		System.out.println(s1);

		String s3 = s2.toLowerCase();
		System.out.println(s3);

		System.out.println("------------------------");
		// ȥ���ַ������˵Ŀհ��ַ�
		String s4 = s1.trim();
		System.out.println(s4);

		System.out.println(s1);

	}
}
