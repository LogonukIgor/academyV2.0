package by.academy.homework.hw3;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if(RegexDate.validAmerican(line)==false) {
			return false;
		}else {
			return true;
		}
	}

}
