package day27_Pattern.demo8;

public class TestCglib {
	public static void main(String[] args) {
		// 创建目标对象
		UserDao dao = new UserDao();
		// 创建代理对象
		CglibProxyFactory c = new CglibProxyFactory(dao);
		UserDao d = (UserDao) c.getProxyInstance();
		// ִ执行代理对象的方法
		d.save();
	}
}
