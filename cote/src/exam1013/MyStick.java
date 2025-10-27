package exam1013;

public class MyStick implements usb {
	public long size = 8 * 1073741824;
	public long currentUsage = 0;
	
	public MyStick() {
	}
	
	public MyStick(int giga) {
		size = giga * 1073741824L;
	}
	
	public String read() {
		return "총 " + currentUsage + "바이트사용";
	}
	public void write(long dataSize) {
		long leftSize = size - currentUsage;
		if(dataSize <= leftSize) {
			currentUsage += dataSize;
		}
	}
}
