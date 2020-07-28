package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		try {
			
			System.out.println("Disconnect the MAchine from Internet");
			System.out.println("Verify that this message is displayed");
			System.out.println(10/0);
			//System.out.println("Connect the MAchine to Internet");

				
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			//System.out.println("Connect the MAchine to Internet");

			}finally {
				System.out.println("Connect the MAchine to Internet");

				
			}
	}
}