package day26_JDK8.demo2;
/*
 * Lambda���ʽʵ����ʾ
 * 
 * Lambda���ʽ�����ͽ���"Ŀ������"������һ�������ӿ�(���壺һ���ӿڣ����ֻ��һ����ʾ�����ĳ��󷽷�����ô������һ�������ӿڡ�һ����@FunctionlInterface)
 * 
 * 
 * ���Խ�lambda���ʽΪһ�������ӿڸ�ֵ
 * 
 */
public class TestLambda1 {
	public static void main(String[] args) {
		
		//() -> 5   ����Ҫ����������ֵΪ5
		
		
//		FunctionInterface fi = () -> 5;
//		int i = fi.operation();
//		System.out.println(i);
		
		
		// x -> 2 * x   ����һ������(��������)��������2����ֵ
//		FunctionInterface fi =(int x) -> 2 * x;
//		int i = fi.operation(2);
//		System.out.println(i);
		
		
		//(x,y) -> x-y    ����2������(����),���ҷ������ǵĲ�ֵ
		FunctionInterface fi = (x,y) -> x-y;		
		int operation = fi.operation(3, 2);
		System.out.println(operation);
		
		//(int x,int y) -> x+y   ����2��int���͵��������������ǵĺ�
//		FunctionInterface fi = (int x,int y) -> x+y;		
//		int operation = fi.operation(3, 2);
//		System.out.println(operation);
		
		//(String s) -> System.out.print(s)   ����һ��String���󣬲��ڿ���̨��ӡ���������κ�ֵ
//		FunctionInterface fi = (String s) -> System.out.println(s);
//		fi.operation("���Lambda");
	}
}

@FunctionalInterface
interface FunctionInterface{
//	int operation();
//	int operation(int a);
	int operation(int x,int y);
	//int operation(int x,int y);
	//void operation(String str);

	
}
