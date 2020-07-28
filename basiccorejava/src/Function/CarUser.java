package Function;

public class CarUser {

	public static void main(String[] args) {

    Car car1 = new Car();
    car1.Color="Red";
    car1.capacity=6;
    car1.features();
    
    Car car2 = new Car();
    car1.Color="White";
    car1.capacity=5;
    car1.features();
    
    Car car3 = new Car();
    car1.Color="Black";
    car1.capacity=7;
    car1.features();
	
	Car car4 = new Car("Silver",5);
	car4.features();
	}

}
