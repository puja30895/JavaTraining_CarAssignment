package CarAssignment;

public class Car {
	Engine e;
	Car(Engine e){
		this.e = e;
	}
	
	void getWhichEngine() {
		e.run();
	}
}
