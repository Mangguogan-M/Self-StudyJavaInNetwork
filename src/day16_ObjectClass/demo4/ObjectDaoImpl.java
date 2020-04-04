package day16_ObjectClass.demo4;

/*
 * 实现类在实现接口的时候又两种方式
 * 		第一种情况：已经知道是什么类型了
 */
/*public class ObjectDaoImpl implements ObjectDao<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}
}*/

/*
 * 第二种情况：
 * 		还不知道什么类型，未知
 */
public class ObjectDaoImpl<T> implements ObjectDao<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}

}
