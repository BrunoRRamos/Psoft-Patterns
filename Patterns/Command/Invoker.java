package Command;

public class Invoker {
    private SmartLampCommands smartLampCommands;

    public void executeCommand() {
        smartLampCommands.execute();
    }

    public void undoCommand() {
        smartLampCommands.undo();
    }
}
