package day27_Pattern.demo7;

public class TestProxy {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();

		UserProxy up = new UserProxy(dao);

		UserDao u = (UserDao) up.getProxyObject();
		u.delete();
		u.save();
	}
}
