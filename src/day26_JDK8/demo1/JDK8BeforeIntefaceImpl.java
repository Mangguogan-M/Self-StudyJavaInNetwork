package day26_JDK8.demo1;

/*
 * ����������ӿڵľ�̬����һģһ��������һ��ʵ����ͬʱʵ�����������ӿڣ���ʱ�����ᱨ����ΪJDK8
 * ֻ��ͨ���ӿ�����ýӿ��еľ�̬�������жԱ�������˵�ǿ������ֵġ�������������ӿ��ж�����һģһ����Ĭ�Ϸ�����ʱ�򣬲���һ��ʵ��
 * ��ͬʱʵ�����������ӿڣ���ô������ʵ��������дĬ�Ϸ�����������뱨��
 */
public class JDK8BeforeIntefaceImpl implements JDK8BeforeInteface,JDK8BeforeInteface2 {

	//����JDK8BeforeInteface��JDK8BeforeInteface2��default����һ��������������븲��
	//����ӿ��е�Ĭ�Ϸ�����������ĳ�������ʱ�� ����ôʵ������Ը���Ĭ�Ϸ���
	@Override
	public void defaultMethod() {
		System.out.println("�ӿ�ʵ���า���˽ӿ��е�default");
		
	}

	//ʵ�ֽӿں���ΪĬ�Ϸ������ǳ��󷽷������Կ��Բ�����д���������������Ҫ��Ҳ������д��
	
}
