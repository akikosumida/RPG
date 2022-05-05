package extend.practice;

public class Oak extends Monster {

	public Oak(String name, int hp, int offensive) {
		super(name, hp, offensive);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(Living target) {
		int nn = offensive * Rand.get(10);
		target.hp -= nn; 
		System.out.print(this.name + "が槍で攻撃！");
		System.out.println(target.name + "に" + nn + "のダメージを与えた。");
	}
}
