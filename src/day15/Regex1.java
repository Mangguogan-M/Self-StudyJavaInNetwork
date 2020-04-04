package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ʾ������ʽ�÷�
 */
public class Regex1 {
	public static void main(String[] args) {

		// 1.��д������ʽ��ƥ��abc�����ⵥ���ַ�
		String reg = "[abc]$";

		// 2.��д������ʽƥ��abc������3���ַ�
		String reg1 = "[abc]{3}";

		// 3.��д������ʽƥ����ĸ���֣�Ҫ�����0����1��
		String reg2 = "[a-zA-Z0-9]?";

		// 4.��д������ʽƥ����ĸ�����»���
		String reg3 = "\\w";

		System.out.println("--------��һ��ƥ�䷽ʽ---------");
		boolean mc = "adc".matches(reg1);
		System.out.println(mc);

		boolean mc1 = "acc".matches(reg1);
		System.out.println(mc1);

		System.out.println("--------�ڶ���ƥ�䷽ʽ----------");
		boolean b = Pattern.matches(reg2, "9");
		System.out.println(b);

		System.out.println("--------������ƥ�䷽ʽ----------");
		// compile(String regex) ��������������ʽ���뵽ģʽ�С�

		// ��������������ʽ���뵽ģʽ�С�
		Pattern pattern = Pattern.compile(reg3);
		// Matcher matcher(CharSequence input) ����ƥ������������ģʽ��ƥ������
		// ����ƥ������������ģʽ��ƥ����
		Matcher matcher = pattern.matcher("6");
		// ���Խ�����������ģʽƥ��
		boolean matches = matcher.matches();
		System.out.println(matches);

	}
}
