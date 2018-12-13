package undo;

public class ProjectorScreenLowerCommand implements Command {
	
	ProjectorScreen projectorScreen;
	
	public ProjectorScreenLowerCommand(ProjectorScreen projectorScreen) {
		this.projectorScreen = projectorScreen;
	}

	public void execute() {
		projectorScreen.lower();
	}

	public void undo() {
		projectorScreen.raise();
		
	}
	
}
