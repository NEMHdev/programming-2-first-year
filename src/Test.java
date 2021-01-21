import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		CarRentalCompany nickCars = new CarRentalCompany();

		Name name = new Name("Nick", "Program");
		Name name2 = new Name("Bob", "Pringle");

		Calendar cal = Calendar.getInstance(); // a series of calendars to set
												// dates
		cal.set(1996, 7, 30);
		Date date = cal.getTime();

		Calendar cal2 = Calendar.getInstance();
		cal2.set(1990, 7, 30);
		Date date2 = cal2.getTime();

		Calendar cal3 = Calendar.getInstance();
		cal3.set(2014, 7, 30);
		Date date3 = cal3.getTime();

		Calendar cal4 = Calendar.getInstance();
		cal4.set(2008, 7, 30);
		Date date4 = cal4.getTime();

		System.out.println(name + ": " + "Expected Age = 20: " + nickCars.getAge(date));
		System.out.println(name2 + ": " + "Expected Age = 26: " + nickCars.getAge(date2));
		System.out.println();

		SmallCar s = new SmallCar();
		s.distance = 80;
		s.setRented(true);
		System.out.println("Small Car:"); // a series of tests for large cars
		System.out.println("Registration Number:" + s.getRegNumber());
		System.out.println("Capacity:" + s.getCapacity() + " Current Fuel:" + s.getCurrentFuel());
		System.out.println("Fuel After drive: " + s.drive());
		System.out.println("Add fuel: " + s.addFuel(2));
		System.out.println("Current fuel after adding fuel: " + s.currentFuel);
		System.out.println();

		LargeCar l = new LargeCar(); // a series of tests for large cars
		l.distance = 25;
		l.setRented(true);
		System.out.println("Large Car:");
		System.out.println("Registration Number:" + l.getRegNumber());
		System.out.println("Capacity:" + l.getCapacity() + " Current Fuel:" + l.getCurrentFuel());
		System.out.println("Fuel after drive: " + l.drive());
		System.out.println("Add fuel: " + l.addFuel(1));
		System.out.println("Current fuel after adding fuel: " + l.currentFuel);
		System.out.println();

		System.out.println(LicenceNumber.getInstance(name, date3));
		System.out.println(LicenceNumber.getInstance(name2, date4));

		DrivingLicence drili = new DrivingLicence(name, date, date2, true);
		System.out.println(drili.getLnum());
		// System.out.println(drili.);
		//// DrivingLicence drili2 = new DrivingLicence(name2, date, date,
		//// true);
		nickCars.issueCar(drili, "small");
		// nickCars.issueCar(drili2, "large");
		System.out.println(nickCars.sc.get(0).rented());
		// System.out.println(nickCars.sc.get(1).rented());
		// System.out.println( " " + LargeCar.fuelCapacity);
		System.out.println("Available small cars" + nickCars.availableCars("small"));
	}
}