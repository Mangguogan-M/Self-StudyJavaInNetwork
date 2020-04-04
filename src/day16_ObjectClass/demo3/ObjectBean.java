package day16_ObjectClass.demo3;

/*public class ObjectBean<T> {
	
	public void show(String str){
		System.out.println(str);
	}

	public void show(int i) {
		System.out.println(i);
	}
	
	public void show(T t){
		System.out.println(t);
	}
}*/
/*
 * 泛型方法：将泛型定义在方法上
 */
public class ObjectBean {

	public <T> void show(T t) {
		System.out.println(t);
	}

}
