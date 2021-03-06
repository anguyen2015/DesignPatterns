package undo;

public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOnCommand (Light light) {
		
		this.light = light;
	}
	
	public void execute() {
		prevLevel = light.getLevel();
		light.dim(80);
	}
	
	public void undo() {
		light.dim(prevLevel);
	}
	
}
