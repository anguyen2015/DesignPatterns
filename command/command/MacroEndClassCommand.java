package undo;

public class MacroEndClassCommand implements Command {

	Light light;
	ProjectorScreen projectorScreen;
	Projector projector;
	int prevLevel;
	
	public MacroEndClassCommand(Light light, ProjectorScreen projectorScreen, Projector projector) {
		this.light = light;
		this.projectorScreen = projectorScreen;
		this.projector = projector;
	}
	

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(100);
		projectorScreen.raise();
		projector.off();
		
	}

	public void undo() {
		light.dim(prevLevel);
		projectorScreen.lower();
		projector.on();
		
	}

}
