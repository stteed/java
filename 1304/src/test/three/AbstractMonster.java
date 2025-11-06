package test.three;

public class AbstractMonster {
	public String name;
	public int hp;
	public int attack;
	public int defender;
	
	public AbstractMonster(String name) {
		this.name = name;
		this.hp = 0;
		this.attack = 0;
		this.defender = 0;
	}
	
	void defender(int attack){
		System.out.println();
	}
}
