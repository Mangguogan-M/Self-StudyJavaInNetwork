package day27_Pattern.demo8;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/*
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
public class CglibProxyFactory implements MethodInterceptor {

	private Object target;

	public CglibProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象创建一个代理
	public Object getProxyInstance() {
		// 1.工具类
		Enhancer en = new Enhancer();
		// 2.设置父类
		en.setSuperclass(target.getClass());
		// 3.设置回调函数
		en.setCallback(this);
		// 4.创建子类
		return en.create();

	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {

		System.out.println("开启事务");
		// ִ执行目标对象方法
		Object invoke = method.invoke(target, arg2);
		System.out.println("提交事务");
		return invoke;
	}

}
