package undo;

public class Projector {
	
	String location;
	int status;
	
	public static final int ON = 1;
	public static final int OFF = 0;
	
	public Projector(String location) {
		this.location = location;
	}
	
	public void on() {
		status = ON;
		System.out.println("Projector is ON");
	}

	public void off() {
		status = OFF;
		System.out.println("Projector is OFF");
	}
	
	public int getStatus() {
		return status;
	}
}
