package crackPassword;

public class Cracker {

	
	private String password;
	private boolean isCracked;
	private char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public Cracker(String password) {
		this.password = password;
	}
	
	
	//accessors
	public boolean getIsCracked() {
		return isCracked;
	}
	
	
	//mutators
	public void resetIsCracked() {
		isCracked = false;
	}
	
	
	
	//Cracking time *hacker noise*
	
	public void crackNums() {
		
		//simple numbers first
		
		while(!isCracked) {
			for (int i = 0; i < 100001; i++) {
				
				if(Integer.parseInt(password) == i) {
					System.out.println("The password you entered was "+i);
					isCracked = true;
				}
				
				else {
					System.out.println(i + " number of operations");
					
				}
				
			}
		}
		
		resetIsCracked(); //this is in the hopes that if i run two methods at once, then the logic wont get fucked.
		
	}
		
	
	//these both use the same bool value. MAKE SURE TO RESET isCracked;
	public void crackLetters() {
		
		String tempPassword = "";
		
		while (!isCracked) {
			
			
			
			
			
			
		}
		
		
	}
	
	
	public void printLetterArray() {

		char shouldBeA = alphabet.get(97);
		
		System.out.println(alphabet);
		
		System.out.println(alphabet.length);
		
		System.out.println(alphabet.);
	}
	
}
