package exceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun = new Functions();

	public static void main(String[] args) {

				try {
					// Step 1 Verify About Link
					int a= 10;
					int b= 1;
					System.out.println(a/b);
					
				
								
					// Step 2 Verify Download  Link is present

					String[] str = new String[2];
					str[1]="Anand";	
								 
				
				 // Step 3 Verify Project  Link is present
				
				fun.fun1();
			}
				catch (ArithmeticException e) {
					System.out.println("ArtihmeticException Occured :" +e.getMessage());
				
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException Occured :" +e.getMessage());
				
				}
				catch (NullPointerException e) {
					System.out.println("NullPointerException Occured :" +e.getMessage());
				
				}
				catch (Exception e) {
					System.out.println("Unknown Exception Occured :" +e.getMessage());
				
				}
			}
}
