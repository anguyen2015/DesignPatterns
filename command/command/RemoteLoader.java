package undo;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		Light classroomLight = new Light("Classroom");
		ProjectorScreen projectorScreen = new ProjectorScreen("Classroom");
		Projector projector = new Projector("Classroom");
		
		
		MacroStartClassCommand startClass = 
				new MacroStartClassCommand(classroomLight, projectorScreen, projector);
		MacroEndClassCommand endClass = 
				new MacroEndClassCommand(classroomLight, projectorScreen, projector);
 
		remoteControl.setCommand(0, startClass, endClass);
		
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		// remoteControl.undoButtonWasPushed();
		System.out.println(remoteControl);
		remoteControl.offButtonWasPushed(0);
		// remoteControl.undoButtonWasPushed();
		
	}
}
