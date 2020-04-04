package day27_Pattern.demo6;

/*
 * 静态代理
 */
public class TestProxy {
	public static void main(String[] args) {

		UserDao dao = new UserDaoImpl();
		dao.delete();

		UserDao proxy = new UserProxy(dao);
		proxy.delete();

	}
}
