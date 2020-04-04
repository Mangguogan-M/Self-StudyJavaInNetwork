package day27_Pattern.demo6;

/*
 * 代理类
 */
public class UserProxy implements UserDao {
	private UserDao dao;
	public UserProxy(UserDao dao){
		this.dao=dao;
	}

	@Override
	public void delete() {
		System.out.println("开启事务");
		dao.delete();
		System.out.println("提交事务");
	}

	@Override
	public void save() {
		System.out.println("开启事务");
		dao.save();
		System.out.println("提交事务");
	}

}
