package CarAssignment;

public class MainClass {
	public static void main(String args[]) {
		Engine e1 = new VWEngine();
		Engine e2 = new BMWEngine();
		
		Car c1 = new Car(e1);
		Car c2 = new Car(e2);

		System.out.println("Car 1: ");
		c1.getWhichEngine();
		System.out.println("Car 2: ");
		c2.getWhichEngine();
	}
}
