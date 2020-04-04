package day16_ObjectClass.demo4;

/*
 * 泛型接口：将泛型定义在接口上
 */
public interface ObjectDao<T> {
	public abstract void show(T t);
}
