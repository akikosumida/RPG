package extend.practice;

public class Brave extends Human {

	public Brave(String name, int hp, int offensive) {
		super(name, hp, offensive);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(Living target) {
		int nn = offensive * Rand.get(10);
		target.hp -= nn;
		System.out.printf("%sが剣で攻撃！",this.name);
		System.out.println(target.name + "に" + nn + "のダメージを与えた。");

	}
}
