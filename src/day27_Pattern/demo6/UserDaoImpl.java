package day27_Pattern.demo6;

public class UserDaoImpl implements UserDao {

	@Override
	public void delete() {
		System.out.println("删除");
	}

	@Override
	public void save() {
		System.out.println("保存");
	}
}
