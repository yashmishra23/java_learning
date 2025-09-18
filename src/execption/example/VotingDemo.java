package execption.example;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class Voting{
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Yu are not eligible");
		}
		else{
			System.out.println("you are eligible");
		}
	}
}

public class VotingDemo {

	public static void main(String[] args) throws InvalidAgeException{
	Voting vi = new Voting();
	try {
	vi.checkEligibility(14);
	}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
		}

	finally {
		System.out.println("2");
	}
	}

}
