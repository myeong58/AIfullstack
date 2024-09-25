package emp;

abstract class Employee {
	private String name;
	private int number;
	private String department;
	private int salay;
	
	public Employee() {}
	
	public Employee(String name, int number, String department, int salay) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salay = salay;
	}
	
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}
	
	abstract public double tax() ;
	
	public int getSalay() {
		return salay;
	}
	
	public void setSalay(int salay) {
		this.salay = salay ;
	}
	

}
