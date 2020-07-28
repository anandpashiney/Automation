package oops.Abstraction;

public class Hdfc implements Rbi{

	@Override
	public void savingAccount() {

		System.out.println("HDFC savingAccount");		

	}

	@Override
	public void currentAccount() {
System.out.println("HDFC currentAccount");		
	}

	@Override
	public void debitcard() {
		System.out.println("HDFC debitcard");		
		
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC creditcard");		
		
	}

}
