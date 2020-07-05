package oops.inheritance;

public class Users {
	
	public static void main(String[] args) {
		
		SmartPhone sm= new SmartPhone();
		sm.calling();
		sm.texting();
		sm.videocall();
		
		Mobile mob = new Mobile();
		mob.calling();
		
		Telephone tel = new Telephone();
		tel.calling();
		
	}

}
