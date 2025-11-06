package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
 }
