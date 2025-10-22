package exam1013;

public class Tire {
	protected String modelName; 
	protected int maxRotation;
	protected int currentRotation;
	
	public Tire(String modlName, int maxRotation) {
		this.modelName = modelName;
		this.maxRotation = maxRotation;
		this.currentRotation = 0;
	}
	public boolean roll() {
		if(currentRotation >= maxRotation) {
			return false;
		}
		else {
			currentRotation += 1;
			return true;
		}
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getCurrentRotation() {
		return currentRotation;
	}

	public void setCurrentRotation(int currentRotation) {
		this.currentRotation = currentRotation;
	}
	
	
}
