package day19_Map.demo1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * ��ʾHashtable��ʹ��
 */
public class HashtableDemo {
	public static void main(String[] args) {

		// 1.����Map����
		Map<String, String> map = new Hashtable<>();

		// ���Ԫ��
		map.put("zhangsan", "java");
		map.put("lisi", "android");
		map.put("wangwu", "python");
		map.put("zhaoliu", "c++");// Hashtable ������Ϊnull��ֵҲ����Ϊnull

		// ��������
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string + " " + map.get(string));
		}

	}
}
