package undo;

public class ProjectorScreen {
	String location;
	int status;
	
	public static final int LOWER = 1;
	public static final int RAISE = 0;
	
	public ProjectorScreen(String location) {
		this.location = location;
	}
		
	public void lower() {
		status = LOWER;
		System.out.println("Projector Screen is Lowered");
	}
	
	public void raise() {
		status = RAISE;
		System.out.println("Projector Screen is Raised");
	}
	
	public int getStatus() {
		return status;
	}
}