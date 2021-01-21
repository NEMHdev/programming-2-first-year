
public class LargeCar extends AbstractCar {

	// public SmallCar(){
	// super();
	// }

	public int getCapacity() { // states fuel capacity for large cars
		fuelCapacity = 65;
		return fuelCapacity;
	}

	@Override
	public int drive() { // simulates a journey and returns the remaining fuel
		if (rented() == true) {
			currentFuel = fuelCapacity;
			if (distance <= 50) {
				return fuelAfterDrive = currentFuel - 4;
			} else if (distance > 50) {
				int amountover = (distance - 50) / 20;
				return fuelAfterDrive = currentFuel - (4 + amountover);
			}
		} else {
			System.out.println("Car is not Rented");
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
