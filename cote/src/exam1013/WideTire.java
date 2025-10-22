package exam1013;

public class WideTire extends Tire{
	
	private int width;
	
	public WideTire(String modlName, int maxRotation, int width) {
		super(modlName, maxRotation);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
