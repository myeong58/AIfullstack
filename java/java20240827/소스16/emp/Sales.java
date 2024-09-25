package emp;

public class Sales extends Employee implements Bounus {
	public Sales() {}

	public Sales(String name, int number, String department, int salay) {
		super(name,number,department,salay);
	}
	
	@Override
	public double tax() {
		
		return getSalay() * 0.13;
	}

	@Override
	public void incentive(int pay) {
		setSalay((int)(getSalay() + pay*1.2));
	}
	
	public double getExtraPay() {
		
		return getSalay() * 0.03;
	}
}
