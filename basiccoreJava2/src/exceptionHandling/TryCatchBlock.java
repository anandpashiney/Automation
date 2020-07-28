package exceptionHandling;

public class TryCatchBlock {


			public static Functions fun=new Functions();
			

			public static void main(String[] args) {

				try {
					// Step 1 Verify About Link  
					int a= 10;
					int b= 0;
					System.out.println(a/b);
					
				}catch (Exception e) {
					System.out.println("Exception Occured :" +e.getMessage());
				}
				
		 
				try {
					// Step 2 Verify Download  Link is present

					String[] str = new String[2];
					str[2]="Anand";	
				}catch (Exception e) {
					System.out.println("Exception Occured :" +e.getMessage());
				}
				 
				
				 // Step 3 Verify Project  Link is present
				
				fun.fun1();
	}

}
