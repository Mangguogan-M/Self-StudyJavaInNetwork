package day19_Map.demo3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pokers {

	LinkedList<Cards> list = new LinkedList<>();

	// 花色数组
	String[] colors = { "♠", "♥", "♣", "♦" };
	// 号码数组
	String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	// 如何将花色与号码使用字串拼接
	// 初始化纸
	public Pokers() {

		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < number.length; j++) {
				list.add(new Cards(colors[i], number[j], j));
			}
		}

		list.add(new Cards("", "大王", 100));
		list.add(new Cards("", "小王", 99));

	}

	public LinkedList<Cards> getList() {
		return list;
	}

	public void setList(LinkedList<Cards> list) {
		this.list = list;
	}

	// 洗牌
	public LinkedList<Cards> shuffle(LinkedList<Cards> list2) {
		// 打乱纸牌顺序
		Collections.shuffle(list2);

		return list2;
	}

	public LinkedList<Cards> deal(LinkedList<Cards> shuffle, List<Cards> list1, List<Cards> list2, List<Cards> list3) {

		while (shuffle.size() > 3) {
			list1.add(shuffle.removeFirst());
			list2.add(shuffle.removeFirst());
			list3.add(shuffle.removeFirst());
		}

		// 理牌
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		return shuffle;
	}

}
