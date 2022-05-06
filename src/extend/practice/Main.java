package extend.practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 人間クラスのリスト
		ArrayList<Human> humanList = new ArrayList<>();
		humanList.add(new Brave("勇者", 600, 60));
		humanList.add(new Fighter("戦士", 700, 50));
		humanList.add(new Wizard("魔法使い", 500, 55));
		// モンスタークラスのリスト
		ArrayList<Monster> monsterList = new ArrayList<>();
		monsterList.add(new Slime("スライム", 300, 30));
		monsterList.add(new Oak("オーク", 500, 40));
		monsterList.add(new Dragon("ドラゴン", 600, 50));

		//★(humanList.size() >= 1 &&  monsterList.size() >= 1)と悩んだ
		//★break文を活かしてシンプルにした
		while (true) {

			System.out.println("人間のターン!");
			Human attackerH = humanList.get(Rand.get(humanList.size()));
			Monster targetM = monsterList.get(Rand.get(monsterList.size()));

			attackerH.attack(targetM);

			if (targetM.hp <= 0) {
				monsterList.remove(targetM);
				System.out.println(targetM.name + "は倒れた。");
			}
			if (monsterList.isEmpty()) {
				System.out.println("勇者達は勝利した！");
				break;
			}

			System.out.println("モンスターのターン!");
			Monster attackerM = monsterList.get(Rand.get(monsterList.size()));
			Human targetH = humanList.get(Rand.get(humanList.size()));

			attackerM.attack(targetH);

			if (targetH.hp <= 0) {
				humanList.remove(targetH);
				System.out.println(targetH.name + "は倒れた。");
			}

			if (humanList.isEmpty()) {
				System.out.println("勇者達は敗北した！");
				break;
			}
		}
	}
}
