import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LicenceNumber {

	private final Date dateOfIssue;
	private final Name name;

	private static String lNumber;

	private final static Map<String, LicenceNumber> NUMBERS = new HashMap<String, LicenceNumber>();

	private LicenceNumber(Name name, Date dateOfIssue) {
		this.name = name;
		this.dateOfIssue = dateOfIssue;
	}

	public static LicenceNumber getInstance(Name name, Date dateOfIssue) {
		LicenceNumber ln = new LicenceNumber(name, dateOfIssue);
		String initial = name.getFirstName().substring(0, 1) + name.getLastName().substring(0, 1);

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(dateOfIssue);
		int yearOfIssue = cal1.get(Calendar.YEAR);

		Random r = new Random();
		int random1 = r.nextInt(9);
		int random2 = r.nextInt(9);
		String arbitraryNumber = random1 + "" + random2;

		lNumber = String.format("%s%04d%s", initial, yearOfIssue, arbitraryNumber);

		if (NUMBERS.containsKey(lNumber)) {
			throw new IllegalArgumentException();
		} else {
			NUMBERS.put(lNumber, ln);
		}
		return NUMBERS.get(lNumber);
	}

	public String ToString() {
		return lNumber;

	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public Name getName() {
		return name;
	}

}
