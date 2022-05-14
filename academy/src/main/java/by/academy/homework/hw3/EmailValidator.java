package by.academy.homework.hw3;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String line) {
		if(RegexDate.validEmail(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}
