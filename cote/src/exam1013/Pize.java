package exam1013;

public class Pize {
	public String name;
	public String size;
	public int[] prices;
	public String toppings;
	
	public void cook() {
		System.out.println(name+size+"을 조리합니다");
		System.out.println(name+size+"이 완성되었습니다");
	}
	
	public void serve() {
		int prive;
		switch(size) {
			case "S": prive = prices[0]; break;
			case "M": prive = prices[1]; break;
			default : prive = prices[2]; 
		}
	}
}
