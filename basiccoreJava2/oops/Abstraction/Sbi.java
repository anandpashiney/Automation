package oops.Abstraction;

public class Sbi implements Rbi {


	@Override
	public void savingAccount() {

		System.out.println("SBI savingAccount");		

	}

	@Override
	public void currentAccount() {
System.out.println("SBI currentAccount");		
	}

	@Override
	public void debitcard() {
		System.out.println("SBI debitcard");		
		
	}

	@Override
	public void creditcard() {
		System.out.println("SBI creditcard");		
		
	}

}
