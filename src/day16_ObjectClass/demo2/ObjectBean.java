package day16_ObjectClass.demo2;

/*
 * 通过泛型类型解决安全问题
 * 
 * 		泛型类，定义在类名后面
 */
public class ObjectBean<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
