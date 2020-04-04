package day27_Pattern.demo7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * JDK动态代理
 */
public class UserProxy {

	private Object obj;

	public UserProxy(Object obj) {
		this.obj = obj;
	}

	public Object getProxyObject() {

		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						System.out.println("开启事务");
						Object invoke = method.invoke(obj, args);
						System.out.println("结束事务");
						return invoke;
					}
				});
	}

}
