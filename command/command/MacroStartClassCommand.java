package undo;

public class MacroStartClassCommand implements Command {

	Light light;
	ProjectorScreen projectorScreen;
	Projector projector;
	int prevLevel;
	
	public MacroStartClassCommand(Light light, ProjectorScreen projectorScreen, Projector projector) {
		this.light = light;
		this.projectorScreen = projectorScreen;
		this.projector = projector;
	}
	

	public void execute() {
		
		prevLevel = light.getLevel();
		light.dim(80);
		projectorScreen.lower();
		projector.on();
		
	}

	public void undo() {
		light.dim(prevLevel);
		projectorScreen.raise();
		projector.off();
		
	}

}
