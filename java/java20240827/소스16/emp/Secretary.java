package emp;

public class Secretary extends Employee implements Bounus{
	public Secretary() {}

	public Secretary(String name, int number, String department, int salay) {
		super(name,number,department,salay);
	}
	
	@Override
	public double tax() {
		
		return getSalay() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		setSalay((int)(getSalay() + pay*0.8));
	}
	
	
	
}
