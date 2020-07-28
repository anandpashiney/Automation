package Function;

public class NonStaticMethods {
	public  String name = "Anand";
	

	// Static function can only call static function and static variable
	public static void main(String[] args) {

		// Refrence				//Object
		NonStaticMethods obj = new NonStaticMethods();
		
		System.out.println(obj.name);
	}
	
	}
