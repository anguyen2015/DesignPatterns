package undo;

public class ProjectorScreenRaiseCommand implements Command {
	
	ProjectorScreen projectorScreen;
	
	public ProjectorScreenRaiseCommand(ProjectorScreen projectorScreen) {
		this.projectorScreen = projectorScreen;
	}

	public void execute() {
		projectorScreen.raise();
		
	}

	public void undo() {
		projectorScreen.lower();
		
	}
}
