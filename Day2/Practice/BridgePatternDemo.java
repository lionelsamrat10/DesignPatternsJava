//Abstraction in Bridge Pattern
abstract class Vehicle{
	protected Workshop workshop1;
	protected Workshop workshop2;
	protected Vehicle(Workshop workshop1, Workshop workshop2) {
		super();
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	//Abstract method
	abstract public void manufacture();	
}
//Refine abstraction 1 in Bridge Pattern
class Car extends Vehicle{
	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	public void manufacture() {
		System.out.println("Car ");
		workshop1.work();
		workshop2.work();
	}
}

//Refine abstraction 2 in Bridge Pattern
class Bike extends Vehicle{
	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	public void manufacture() {
		System.out.println("Bike ");
		workshop1.work();
		workshop2.work();
	}
}

//Implementor for Bridge Pattern
interface Workshop{
	abstract public void work();
}

//Concrete implementation 1 for Bridge pattern
class Produce implements Workshop{

	@Override
	public void work() {
		System.out.println("Produced!!");
	}
	
}

//Concrete implementation 2 for Bridge pattern
class Assemble implements Workshop{

	@Override
	public void work() {
		System.out.println(" And");
		System.out.println("Assembled!!");
	}
	
}
//Demonstration of Bridge design pattern
public class BridgePatternDemo {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}

}
