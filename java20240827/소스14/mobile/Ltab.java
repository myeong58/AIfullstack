package mobile;

public class Ltab extends Mobile{
	
	public Ltab() {
		super();
	}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}

	@Override
	void operate(int time) {
		int bs = super.getBatterySize();
		super.setBatterySize(bs - time * 10);
		
	}

	@Override
	void charge(int time) {
		int bs = super.getBatterySize();
		super.setBatterySize(bs + time * 10);
	}

}
