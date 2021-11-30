
public class Hangar {

	public static void main(String[] args) {
		Car ferrari = new Car("Ferrari");
		Boat quicksilver = new Boat("Quicksilver");
		
		System.out.println(ferrari.doStuff());
		System.out.println(quicksilver.doStuff());
	}
}
