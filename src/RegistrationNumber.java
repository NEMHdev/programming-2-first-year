import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RegistrationNumber {

	String num;
	String s;
	public String numb = "0123456789";

	private static final Map<String, RegistrationNumber> REG_NUMBER = new HashMap<String, RegistrationNumber>();

	public RegistrationNumber() {
		num = firstNumber() + secondNumber() + thirdNumber() + fourthNumber();
		s = arbitraryLetter();
	}

	public String arbitraryLetter() { // alphabet component of reg number
		String st = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return st.substring(0 + (int) (Math.random() * 25));
	}

	public String firstNumber() { // first numerical component of reg number
		return numb.substring(0 + (int) (Math.random() * 9));
	}

	public String secondNumber() { // second numerical component of reg number
		return numb.substring(0 + (int) (Math.random() * 9));
	}

	public String thirdNumber() { // third numerical component of reg number
		return numb.substring(0 + (int) (Math.random() * 9));
	}

	public String fourthNumber() { // fourth numerical component of reg number
		return numb.substring(0 + (int) (Math.random() * 9));
	}

	public RegistrationNumber getInstance() {
		final String k = s + num;
		if (!REG_NUMBER.containsKey(k))
			REG_NUMBER.put(k, new RegistrationNumber());
		return REG_NUMBER.get(k);
	}

}
