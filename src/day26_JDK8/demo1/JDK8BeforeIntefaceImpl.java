package day26_JDK8.demo1;

/*
 * 如果有两个接口的静态方法一模一样，并且一个实现类同时实现了这两个接口，此时并不会报错，因为JDK8
 * 只能通过接口类调用接口中的静态方法所有对编译器来说是可以区分的。但是如果两个接口中定义了一模一样的默认方法的时候，并且一个实现
 * 类同时实现了这两个接口，那么必须在实现类中重写默认方法，否则编译报错。
 */
public class JDK8BeforeIntefaceImpl implements JDK8BeforeInteface,JDK8BeforeInteface2 {

	//由于JDK8BeforeInteface和JDK8BeforeInteface2中default方法一样，所以这里必须覆盖
	//如果接口中的默认方法不能满足某个需求的时候 ，那么实现类可以覆盖默认方法
	@Override
	public void defaultMethod() {
		System.out.println("接口实现类覆盖了接口中的default");
		
	}

	//实现接口后，因为默认方法不是抽象方法，所以可以不用重写，但是如果开发需要，也可以重写。
	
}
