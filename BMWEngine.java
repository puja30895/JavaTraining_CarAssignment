package CarAssignment;

public class BMWEngine implements Engine{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running "+toString());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}
}
