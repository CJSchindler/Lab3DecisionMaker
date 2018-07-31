package carsLab;

public class UsedCar extends Car {

	private double milage;

	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.milage = milage;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %d\t$%,10.2f \t%s", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), milage);
	}
	
	
}
