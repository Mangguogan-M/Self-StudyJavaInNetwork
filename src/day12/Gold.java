package day12;

//黄金
public class Gold implements Money, Metal {

	@Override
	public void shine() {
		System.out.println("发出了金黄色的光芒.....");
	}

	@Override
	public void buy() {
		System.out.println("买了好多好吃的.....");
	}

}
