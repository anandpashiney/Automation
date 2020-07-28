package Function;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int add=sum(10,20);
   System.out.println(add);
   boolean b= eligible(10);
   System.out.println(b);
   if(b) 
   System.out.println("You are eligible");
   else
   System.out.println("You are not eligible");

	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static boolean eligible(int age) {
		if(age>=18)
		     {return true;}
		else
		     {return false;}
	}
	}


