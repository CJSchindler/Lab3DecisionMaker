package carsLab;

import java.util.ArrayList;

public class CarLot {

	private ArrayList<Car> lotList = new ArrayList<>();

	public CarLot(ArrayList<Car> lotList) {
		super();
		this.lotList = lotList;
	}

	public ArrayList<Car> getCarLot() {
		return lotList;
	}

	public void setCarLot(ArrayList<Car> carLot) {
		this.lotList = lotList;
	}
	
	public void printCarList() {
		for (int i = 0; i < lotList.size(); i++) {
			System.out.println((i + 1) + ". " + lotList.get(i));
		}
	}

	public void addCar(Car addedCar) {
		lotList.add(addedCar);
		
	}
	
	public void removeCar(int userCarToRemove) {
		lotList.remove(userCarToRemove);
	}

	
	
}

