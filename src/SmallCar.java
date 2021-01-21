
public class SmallCar extends AbstractCar {

	// public SmallCar(){
	// super();
	// }

	public int getCapacity() { // this method states the fuel capacity for small
								// cars
		fuelCapacity = 45;
		return fuelCapacity;
	}

	@Override
	public int drive() { // this method is a simulation of a journey taken by a
							// rented car,

		if (rented() == true) {
			currentFuel = fuelCapacity;
			if (distance <= 25) {
				return currentFuel - 1;
			} else if (distance > 25) {
				int amountover = (distance - 25) / 25;
				return fuelAfterDrive = currentFuel - (1 + amountover); // the
																		// Remaining
																		// quantity
																		// of
																		// fuel
																		// is
																		// returned
			}
		} else {
			System.out.println("Car is not Rented"); // a message to warn the
														// user
		}
		return currentFuel;

	}

	@Override
	public int addFuel(int myFuel) { // this is my addFuel method
		if ((fuelAfterDrive + myFuel) >= fuelCapacity) {
			return fuelCapacity - fuelAfterDrive;
		} else {
			return myFuel + (fuelCapacity - (fuelAfterDrive + myFuel));
		}
	}

}
