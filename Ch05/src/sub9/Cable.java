package sub9;

public class Cable implements Socket{

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.setBulb(bulb);
	}

	@Override
	public void switchOn() {
		System.out.println("불 켜짐..");
		
	}

	@Override
	public void switchOff() {
		System.out.println("불 꺼짐..");
		
	}

	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

}

