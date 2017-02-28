package MVC;

public class ButtonClickModel {
	private int value;
	
	protected ButtonClickModel() {
		value = 0;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int incrementValue() {
		this.value++;
		return this.value;
	}

}
