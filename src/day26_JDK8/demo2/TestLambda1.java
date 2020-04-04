package day26_JDK8.demo2;
/*
 * Lambda表达式实例演示
 * 
 * Lambda表达式的类型叫做"目标类型"，它是一个函数接口(定义：一个接口，如果只有一个显示声明的抽象方法，那么它就是一个函数接口。一般用@FunctionlInterface)
 * 
 * 
 * 可以将lambda表达式为一个函数接口赋值
 * 
 */
public class TestLambda1 {
	public static void main(String[] args) {
		
		//() -> 5   不需要参数，返回值为5
		
		
//		FunctionInterface fi = () -> 5;
//		int i = fi.operation();
//		System.out.println(i);
		
		
		// x -> 2 * x   接收一个参数(数字类型)，返回其2倍的值
//		FunctionInterface fi =(int x) -> 2 * x;
//		int i = fi.operation(2);
//		System.out.println(i);
		
		
		//(x,y) -> x-y    接收2个参数(数字),并且返回他们的差值
		FunctionInterface fi = (x,y) -> x-y;		
		int operation = fi.operation(3, 2);
		System.out.println(operation);
		
		//(int x,int y) -> x+y   接收2个int类型的整数，返回他们的和
//		FunctionInterface fi = (int x,int y) -> x+y;		
//		int operation = fi.operation(3, 2);
//		System.out.println(operation);
		
		//(String s) -> System.out.print(s)   接收一个String对象，并在控制台打印，不返回任何值
//		FunctionInterface fi = (String s) -> System.out.println(s);
//		fi.operation("你好Lambda");
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
