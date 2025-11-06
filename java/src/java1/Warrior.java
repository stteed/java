package java1;

public class Warrior extends Character {
	public Warrior(String name) { super(name, 120, 15, 5, 43); }
	
	void arrack(Character target) {
		System.out.println(name + "전사가 칼로 공격합니다. 으라챠차~ ");
		target.damage(atk);
	}
}
