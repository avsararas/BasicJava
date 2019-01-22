package day43_StaticAndConsctuctors;

public class TV {

	private int channel;
	private int volumeLevel;
	private boolean on;
	private String brand;
	
	// Added constructors
	
	public TV() { // First constructor
		
		System.out.println("Creating TV object no Args constructor");
		
		channel = 1;
		volumeLevel = 1;
		brand ="Nordmende";
	}
	
	public TV(String brand) { // Second overloaded
		System.out.println("Creating TV object with one Arg constructor");
		this.brand = brand;
		
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) { // check if on and assign 1-120 ch
		if (on && channel > 0 && channel < 121) {
			this.channel = channel;
		} else {
			System.out.println("TV is off or Invalid Channel");
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) { // volume set between 1 to 7
		if (on && volumeLevel > 0 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("TV is off or invalid volume");
		}
	}

	public boolean isOn() { // just checking on for true or false
		return on;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// custom methods below

	public void turnOn() { // setter method turns the TV on

		if (isOn()) { // calling method on top checking if is on already
			System.out.println(" TV is already on");

		} else {
			on = true;
		}
	}

	public void turnOff() { // setter method turns the TV off

		if (!isOn()) {
			System.out.println(" TV is off");

		} else {
			on = false;
		}
	}
	
	public void channelUp() { // setter method for channel up
		if (isOn() && channel < 120) {
			channel++;
		}
	}
	public void channelDown() { // setter method for channel up
		if (isOn() && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() { // setter method for volume up
		if (isOn() && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	public void volumeDown() { // setter method for volume down
		if (isOn() && volumeLevel > 0) {
			volumeLevel--;
		}
	}

}
