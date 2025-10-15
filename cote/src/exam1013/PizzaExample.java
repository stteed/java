package exam1013;

import java.util.Scanner;

public class PizzaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner name = sc.next();
		Scanner size = sc.next();
		sc.close();
		
		Pizza pizza;
		if(name.equals("C")) {
			pizza = new CheesePizza(size);
		} esle {
			przza = new PopperoniPizza(size);
		}
		pizza.cook();
		pizza.serve();
	}

}
