package Function;

public class Funcation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(10,20);
		sum(20,30);
		sum(40,50);
		sum(10,20,30);
		message("anand");
		eligibility("Anand",32);
		eligibility("abc",17);

	}

	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	// Method Overloading - whenever we have 2 or more functions with same name with different no of parameters
	public static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void message(String name)
	{ System.out.println("Welcome "+name);}
	
	
	public static void eligibility(String name,int age)
	{
	 if(age>17)
	   System.out.println(name+" You are eligible");
	 else 
		   System.out.println(name+" You are not eligible");

	}
	
	public static void 
	}
	
