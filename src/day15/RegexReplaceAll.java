package day15;

/*
 * �滻����
		public String replaceAll(String regex,String replacement)
		ʹ�ø���replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����

 */
public class RegexReplaceAll {
	public static void main(String[] args) {

		// ����һ���ַ���
		String str = "dsadsa12345dhsakjdh1231";

		// ����ȥ�����е����֣���*���滻��
		// String reg = "\\d"; �����������滻��һ��ָ���ַ�
		String reg2 = "\\d+"; // ��һ�������滻��һ��ָ���ַ�

		String string = str.replaceAll(reg2, "*");
		System.out.println(string);

	}
}
