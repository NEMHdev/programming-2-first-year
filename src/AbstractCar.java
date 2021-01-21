
public abstract class AbstractCar implements Car { // change name

	public int currentFuel;
	public int fuelAfterDrive;
	public static int fuelCapacity;
	private boolean fullTank;
	private boolean rented;
	public int distance;
	private String registrationNumber;

	/*
	 * public RegistrationNumber(){ return regNumber; }
	 */

	@Override
	public String getRegNumber() {
		// TODO Auto-generated method stub
		return registrationNumber;
	}

	public abstract int getCapacity();

	public int getCurrentFuel() {
		currentFuel = fuelCapacity;
		return currentFuel;
	}

	public boolean fullTank() {
		return fullTank;
	}

	public boolean rented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public abstract int addFuel(int myFuel);

	public abstract int drive();
}
