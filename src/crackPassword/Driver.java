package crackPassword;

public class Driver {

	
	public static void main(String args[]) {
		
		
		IntakePass myIntakePass = new IntakePass("100000");
		Cracker myCracker = new Cracker(myIntakePass.getPassword());
		
		myCracker.crackNums();
		
	}
	
	
	
	
}
