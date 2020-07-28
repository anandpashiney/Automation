package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPloymorphism {

	public static void main(String[] args) {

		/*
		 * SmartPhone obj = new SmartPhone();
		 * 
		 * Mobile obj2 = new SmartPhone() ;
		 * 
		 * Telephone obj3 = new SmartPhone() ;
		 * 
		 * //You can use refer of ur parent class for the object of child class //You
		 * can not use refer of ur child class for the object of parent class
		 */
		
		/*
		 * Telephone obj4;
		 * 
		 * obj4=new Telephone(); obj4.calling();
		 * 
		 * obj4= new Mobile(); obj4.calling();
		 * 
		 * obj4= new SmartPhone(); obj4.calling();
		 */
	
	
		Telephone obj4=null; //WebDriver		
		String browserName="Chrome";			
		if(browserName.equals("Chrome"))		
		
		{			
			obj4= new Mobile();  //ChromeDriver	
		}
		
		else if(browserName.equals("Firefox")) 	
		{					
			obj4=new SmartPhone(); //FirefoxDriver	
		}
		obj4.calling();
			
	}						//Script start		
	
	
}
