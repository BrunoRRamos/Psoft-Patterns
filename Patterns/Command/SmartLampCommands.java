package Command;

public class SmartLampCommands implements Command {
    private final SmartLamp smartLamp;

    public SmartLampCommands(SmartLamp smartLamp) {
        this.smartLamp = smartLamp;
    }

    @Override
    public void execute() {
        this.smartLamp.on();
    }

    @Override
    public void undo() {
        this.smartLamp.off();
    }
}
