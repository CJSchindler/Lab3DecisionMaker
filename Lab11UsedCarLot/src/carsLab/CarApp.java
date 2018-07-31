package carsLab;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Joe's Car Lot!");
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("Tesla", "Model S", 2017, 80000));
		list.add(new Car("Toyota", "Sienna", 2018, 32000));
		list.add(new Car("Chevrolet", "Traverse", 2018, 35000));
		list.add(new UsedCar ("Ford", "Focus", 1998, 3499, 223856));
		list.add(new UsedCar ("Honda", "Civic", 2002, 5300, 189030));
		list.add(new UsedCar ("Toyota", "Avalon", 2003, 5499, 165551));
		
		CarLot grandCircusLot = new CarLot(list);
		
		grandCircusLot.printCarList();
		
		while (true) {
		System.out.println("\nWhat would you like to do? Choose list, add, remove, look up or quit:");
		String userChoice = scnr.next().trim();
		
			if (userChoice.equalsIgnoreCase("List")) {
				grandCircusLot.printCarList();
				userChoice = scnr.nextLine();
			}
			else if (userChoice.equalsIgnoreCase("add")) {
//				grandCircusLot.addCar();
				userChoice = scnr.nextLine();
				System.out.println("Please enter the car make: ");
				String carMake = scnr.nextLine();
				System.out.println("Please enter the car model: ");
				String carModel = scnr.nextLine();
				System.out.println("Please enter the year: ");
				int carYear = scnr.nextInt();
				System.out.println("Please enter the price: ");
				double carPrice = scnr.nextDouble();
				
				System.out.println("Is this car used? (y/n) ");
				String userAnswer = scnr.next().trim().toLowerCase();
					if (userAnswer.charAt(0) == 'y') {
						System.out.println("Please enter milage: ");
						double userMilage = scnr.nextDouble();
						
						UsedCar userUsedCar = new UsedCar(carMake, carModel, carYear, carPrice, userMilage);
						grandCircusLot.addCar(userUsedCar);
						grandCircusLot.printCarList();
					}
					
				Car userCar = new Car(carMake, carModel, carYear, carPrice);
				grandCircusLot.addCar(userCar);
				grandCircusLot.printCarList();
			}
					
			else if (userChoice.equalsIgnoreCase("remove")) {
				System.out.println("Which car would you like to remove? Enter a number: ");
				int userCarToRemove = scnr.nextInt()-1;
				grandCircusLot.removeCar(userCarToRemove);
				System.out.println("Car has been removed.");
				grandCircusLot.printCarList();
				
			}
			else if (userChoice.equalsIgnoreCase("look up")) {
				System.out.println("\nWhich car would you like to see? (choose a number between 1 and 6): ");
				int userCar = scnr.nextInt();
				System.out.println(list.get(userCar - 1));
				userChoice = scnr.nextLine();
			}
			else if (userChoice.equalsIgnoreCase("quit")) {
				break;
			}
			else {
				System.out.println("Sorry, I didn't understand that. Please try again.");
			}
		}
		System.out.println("Thanks for looking. Goodbye.");

		
	}
}
