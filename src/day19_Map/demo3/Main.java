package day19_Map.demo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// 创建玩家
		// 玩家
		List<Cards> list1 = new ArrayList<>();
		// 玩家
		List<Cards> list2 = new ArrayList<>();
		// 玩家
		List<Cards> list3 = new ArrayList<>();

		// 创建纸牌，对纸牌进行初始
		Pokers pokers = new Pokers();

		// 获取纸牌
		LinkedList<Cards> list = pokers.getList();

		// 洗牌
		LinkedList<Cards> shuffle = pokers.shuffle(list);
		System.out.println(shuffle);

		// 发牌
		LinkedList<Cards> cards = pokers.deal(shuffle, list1, list2, list3);

		System.out.println("玩家一" + list1);
		System.out.println("玩家二" + list2);
		System.out.println("玩家三" + list3);
		System.out.println("底牌" + cards);

	}
}
