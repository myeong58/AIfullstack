package mobile;

public class Otab extends Mobile{
	public Otab() {
		super();
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}

	@Override
	void operate(int time) {
		int bs = super.getBatterySize();
		super.setBatterySize(bs - time * 12);
		
	}

	@Override
	void charge(int time) {
		int bs = super.getBatterySize();
		super.setBatterySize(bs + time * 8);
		
	}
}
