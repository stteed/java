package java1;

public class Character {
	String name;
	int hp, atk, def, mp;
	
	public Character(String name, int hp, int atk, int def, int mp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.mp = mp;
	}
	void attack(Character target) {
	}
	
	boolean die_or_alive() { return hp > 0; }
	
	void damage(int dmg) {
		int realDamage = Math.max(0, dmg - def);
		hp -= realDamage;
		System.out.println(name + "이(가) " + realDamage + " 피해를 입음 (HP: " + hp + ")");
	}
}
