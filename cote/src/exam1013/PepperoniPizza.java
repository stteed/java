package exam1013;

	public class PepperoniPizza {
		public String name = "페퍼로니 피자";
		public String toppings = "pepperoni";
		public String size;
		public int[] prices = { 12000, 17000, 27000};
		
		public PepperoniPizza() { size = "M"; }
		public PepperoniPizza(String size) {
			this.size = size;
		}
		
		public void cook() {
			System.out.println(toppings + "을 추가합니다");
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
