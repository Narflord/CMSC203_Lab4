
public class Television {

	private final String MANUFACTURER;//TV manufacturer
	private final int SCREEN_SIZE;//TV screen size
	private boolean powerOn;//is power on
	private int channel;//Channel tv is currently on.
	private int volume;//Volume of TV currently
	
	public Television(String brand, int size) {
		this.SCREEN_SIZE = size;
		this.MANUFACTURER = brand;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	/**
	 * Changes the power from on to off and vise versa
	 */
	public void power() {
//		if(powerOn == true) {
//			powerOn = false;
//		}
//		else {
//			powerOn = true;
//		}
		powerOn = !powerOn;//Acheves the above code.
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	public String getManufacturer() {
		return MANUFACTURER;
	}

	public void setChannel(int station) {
		this.channel = station;
		
	}

	public void increaseVolume() {
		this.volume ++;
		
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void decreaseVolume() {
		this.volume --;
		
	}
	

}
