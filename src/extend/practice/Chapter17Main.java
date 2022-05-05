package extend.practice;

import java.util.ArrayList;

public class Chapter17Main {

	public static void main(String[] args) {
		// 人間クラスのリスト
		ArrayList<Human> human_list = new ArrayList<>();
		human_list.add(new Brave("勇者", 600, 60));
		human_list.add(new Fighter("戦士", 700, 50));
		human_list.add(new Wizard("魔法使い", 500, 55));
		// モンスタークラスのリスト
		ArrayList<Monster> monster_list = new ArrayList<>();
		monster_list.add(new Slime("スライム", 300, 30));
		monster_list.add(new Oak("オーク", 500, 40));
		monster_list.add(new Dragon("ドラゴン", 600, 50));

		while(human_list.size() >= 1) {

			Living selectH = human_list.get(Rand.get(human_list.size()));
			Living selectM = monster_list.get(Rand.get(monster_list.size()));
			
			System.out.println("人間のターン!");
			selectH.attack(selectM);

			if (selectM.hp <= 0) {
				monster_list.remove(selectM);
				System.out.println(selectM.name + "は倒れた。");
			}
			if (monster_list.isEmpty()) {
				System.out.println("勇者達は勝利した！");
				break;
			}

			System.out.println("モンスターのターン!");
			selectM.attack(selectH);

			if (selectH.hp <= 0) {
				human_list.remove(selectH);
				System.out.println(selectH.name + "は倒れた。");
			}
			if (human_list.isEmpty()) {
				System.out.println("勇者達は敗北した！");
				break;
			}
		}
	}
}
