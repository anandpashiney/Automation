package oops.Abstraction;

public class Icici implements Rbi {

	
	@Override
	public void savingAccount() {

		System.out.println("ICICI savingAccount");		

	}

	@Override
	public void currentAccount() {
System.out.println("ICICI currentAccount");		
	}

	@Override
	public void debitcard() {
		System.out.println("ICICI debitcard");		
		
	}

	@Override
	public void creditcard() {
		System.out.println("ICICI creditcard");		
		
	}

}
