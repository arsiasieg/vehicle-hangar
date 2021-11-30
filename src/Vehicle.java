public abstract class Vehicle {
	//Attributes
	private String brand;
	private int kilometers;
	
	//Constructors
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	//Getters
	public String getBrand() {
		return this.brand;
	}
	
	public int getKilometers() {
		return this.kilometers;
	}
	
	//Setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//Abstract method
	public abstract String doStuff();
	
}
