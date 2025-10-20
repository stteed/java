package exam1013;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[1] = new FullTimeEmployee("김자바", "123456", 40000000);
		emps[2] = new PartTimeEmployee("이자바", "456789", 2000, 160);
		
		for(int i = 0; i < emps.length; i++) {
			String msg = emps[i] getName() + " , " + emps[i].calculatePay();
			System.out.println(msg);
		}
	}

}
