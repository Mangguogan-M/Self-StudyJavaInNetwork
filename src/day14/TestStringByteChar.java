package day14;

/*
 * byte[] getBytes()  - ���ڽ���ǰ�ַ�������ת��Ϊbyte���鲢����  
   char[] toCharArray()  - ���ڽ���ǰ�ַ�������ת��Ϊchar���鲢����
 */
public class TestStringByteChar {
	public static void main(String[] args) {

		// 1.׼��һ���ַ�������
		String s1 = new String("GoodMorning!");

		// 2.�����ַ�������ת��char���鲢��ӡ
		char[] arr = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---------------");
		// 3.���ַ�������ת��Ϊbyte���͵��������
		byte[] by = s1.getBytes();
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);// ASCII 71 111 111 .....
		}

		System.out.println("----------------");
		// 4.ʹ�þ�̬����valueOf���ַ�����ת��ΪString����
		String s2 = String.valueOf(arr);
		System.out.println(s2);

		// 5.ʹ�ù��췽�����ַ�������ת��ΪString����
		String str = new String(arr);
		System.out.println(str);

	}
}
