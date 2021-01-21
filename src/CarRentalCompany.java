import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CarRentalCompany {
	List<SmallCar> sc = new ArrayList<SmallCar>();
	List<LargeCar> lc = new ArrayList<LargeCar>();
	Map<DrivingLicence, AbstractCar> rentedCars = new HashMap<DrivingLicence, AbstractCar>();
	List<Car> currentRentedCars = new ArrayList<Car>(rentedCars.values());

	public void carSelection() {

		for (int i = 0; i <= 19; i++) {
			sc.add(new SmallCar());
		}

		for (int j = 0; j <= 9; j++) {
			lc.add(new LargeCar());
		}
	}

	public void issueCar(DrivingLicence drili, String typeOfCar) {
		if (typeOfCar == "small") {
			if (getAge(drili.getdOB()) >= 21 && getAge(drili.getdOI()) >= 1) {
				for (int k = 0; k <= sc.size(); k++) {
					// iterate through list
					if (sc.get(k).rented() == false) { // check each cars rental
														// status
														//
						rentedCars.put(drili, sc.get(k)); // if its false assign
															// this to
															// car/drivinglicence
															// to
															// put this car in a
															// map

					}
				}
			}
		} else if (typeOfCar == "large") {
			if (getAge(drili.getdOB()) >= 25 && getAge(drili.getdOI()) >= 5) {
				for (int l = 0; l <= sc.size(); l++) {
					// iterate through list
					if (sc.get(l).rented() == false) { // check each cars rental

						sc.get(l).setRented(true); // status
						rentedCars.put(drili, sc.get(l));

					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int availableCars(String typeOfCar) { // this method gives a count of
													// the types of cars that
													// are rented in the map
		int count = 0;
		if (typeOfCar == "small") {
			for (int m = 0; m <= sc.size(); m++) {
				if (!sc.get(m).rented()) {
					count++;

				}
			}

		} else if (typeOfCar == "large") {
			for (int n = 0; n <= sc.size(); n++)
				if (!sc.get(n).rented()) {
					count++;
				}
		}
		return count;
	}

	public List<Car> getRentedCars() {

		return currentRentedCars;

	}

	public int getAge(Date d) { // shows the age of the driver so that full
								// licence can be determined
		Calendar calcurrenttime = Calendar.getInstance();
		Calendar calothertime = Calendar.getInstance();
		calothertime.setTime(d);
		int age = calcurrenttime.get(Calendar.YEAR) - calothertime.get(Calendar.YEAR);
		return age;

	}

	public Car getCar(DrivingLicence drivingLicence) {
		return rentedCars.get(drivingLicence);
	}

	public int terminateRented(DrivingLicence drivingLicence) { // this reverses
																// the changes
																// made by
																// renting a car
		if (rentedCars.containsKey(drivingLicence)) {
			(rentedCars.get(drivingLicence)).setRented(false);
			;
			rentedCars.remove(drivingLicence);
		}
		return (rentedCars.get(drivingLicence)).getCapacity();
	}
}
