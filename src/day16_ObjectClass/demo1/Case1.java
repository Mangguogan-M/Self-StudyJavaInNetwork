package day16_ObjectClass.demo1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayList�洢�ַ���Ԫ��
 * 	
 * 		һ���������ܳ����⣬����������������⡣
 * 
 * 		String[] s = new String[3];
 * 		s[0] = "�����";
 * 		s[1] = "�˽���";
 * 		s[2] = 666;
 * 
 * 		
 * 		���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ������������÷�����ʱ���ȥ��ȷ����������
 * 		�ֳ�֮Ϊ���������ͣ������͵�������һ�����ݡ�
 * 
 * 
 * 		�﷨��ʽ��
 * 			<��������>
 * 			�˴�����������ֻ����������������/������
 * 
 * 
 * 		���ͺô���
 * 			1.�������ڼ�������ᵽ�˱����ڼ�
 * 			2.������ǿ������ת��
 * 			3.�Ż��˳�����ƣ�����˻�ɫ������
 */
public class Case1 {

	public static void main(String[] args) {
		// 1.����һ��ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		// 2.�򼯺�������ַ���Ԫ��
		list.add("����һ���ַ���");
		list.add("�����Ҳ��һ���ַ���");
		// list.add(666);

		// 3.��������
		// �������������ǵĵ�������������ʲô���ͣ�����������ʲô����
		Iterator<String> iterator = list.iterator();

		// hasNext ����Ƿ���Ԫ��
		while (iterator.hasNext()) {
			// String str = (String) iterator.next();
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
