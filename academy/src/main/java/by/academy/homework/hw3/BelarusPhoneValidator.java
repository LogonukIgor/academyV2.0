package by.academy.homework.hw3;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if(RegexDate.validBelarus(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}
