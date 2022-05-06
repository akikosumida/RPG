package extend.practice;

public abstract class Living {
	protected String name; // キャラクターの名前
	protected int hp; // ヒットポイント
	protected int offensive; // 攻撃力

	public Living(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	public abstract void attack(Living target); // ターゲットに攻撃するメソッド
}
