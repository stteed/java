package exam1105;

public class MemoExample {
	
	public static void main(String[] args) {
		MemoRepository r;
		
		r = new LocalRepository();
		r.addMemo("1", "Hello");
		
		r = new RemotelRepository();
		r.addMemo("1", "Hello");
	}
}
