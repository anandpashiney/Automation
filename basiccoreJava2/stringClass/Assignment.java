package stringClass;

public class Assignment {

	public static void main(String[] args) {


		String name ="anand";

		String[] arr = name.split("");
		System.out.println(arr.length);
		
int count=0;
//for ( int iter=0;iter<name.length();iter++)			
//{
	//if(name.charAt(iter)=='a' || name.charAt(iter)=='A' )
	//{count++;}
	
for (String c:arr)
{
	if(c.equals("a"))
	{
		count++;
	}
	
}
	System.out.println(count);	
	}

}
