package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ���ܣ�
	��ȡ��������ַ������������ַ���ɵĵ���
	q xue wan gaoji wo gei ni men jie shao dui xiang,ni men ji bu ji dong?

 */
public class RegexCase {
	public static void main(String[] args) {
		// �����ַ���
		String str = "q xue wan gaoji wo gei ni men jie shao dui xiang,ni men ji bu ji dong?";

		// 1.����������ʽƥ�������ַ���ɵĵ���
		String reg = "\\b[a-zA-Z]{3}\\b";

		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(str);

		// find() ���� ������ƥ����ַ�����
		while (matcher.find()) {

			// ��ʼ������/ƫ����
			int start = matcher.start();
			// ����������/ƫ����
			int end = matcher.end();

			// ��ȡ����ѯ����һ������
			String group = matcher.group();

			System.out.println(start + "  " + group + "  " + end);
		}
	}
}
