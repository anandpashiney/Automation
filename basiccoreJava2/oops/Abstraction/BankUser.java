package oops.Abstraction;

public class BankUser {

	public static void main(String[] args) {

		account(new Sbi());//SBI=Chrome
		account(new Hdfc());//HDFC=Firefox
		account(new Icici());//ICICI=Edge
		
		int a =10;
		sum(a);
		String name="Anand";
		message(name);
		
		
		
	}
				
				public static void account(Rbi bank)//RBI -- Webdriver
				{
					bank.creditcard();//Navigate
					bank.savingAccount();	//Click		
					bank.debitcard();//Enter data
					bank.currentAccount();//Select option
				}
				
				public static void sum(int a)
				{
					
					System.out.println(10+a);
				}

				public static void message(String name)
				{
					
					System.out.println("Your name is "+name);
				}
}
