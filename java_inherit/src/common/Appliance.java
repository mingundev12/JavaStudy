package common;

public abstract class Appliance {

	protected boolean onoff = false;
	protected String name;
	protected int powerCon;

	protected Appliance() {
	}

	protected Appliance(String name, int powerCon) {
		this.name = name;
		this.powerCon = powerCon;
	}
	
	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	
	public abstract void power(); // 추상 메서드
	
}
