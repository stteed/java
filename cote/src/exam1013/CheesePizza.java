package exam1013;

public class CheesePizza {
	public String name = "치즈피자";
	public String size;
	public int[] prices = { 10000, 15000, 25000};
	
	public CheesePizza() { size = "M"; }
	public CheesePizza(String size) {
		this.size = size;
	}
	
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
		System.out.println(name+size+"를 드립나다. 가격:"+prive);
	}
}
