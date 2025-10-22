package exam1013;

public class TireExample {

	public static void main(String[] args) {
		Tire tire = new Tire("기본타이어", 10000);
		WideTire wTire = new WideTire("광폭타이어", 10000, 220);
		ColorTire cTire = new ColorTire("컬러타이어", 10000, "빨강");
	}

}
