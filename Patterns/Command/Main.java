package Command;

public class Main {
    public static void main(String[] args) {
        SmartLamp lampadaQuarto = new SmartLamp();
        SmartLampCommands comandoLuzQuarto = new SmartLampCommands(lampadaQuarto);

        comandoLuzQuarto.execute();
        comandoLuzQuarto.undo();
    }
}
