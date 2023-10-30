package Strategy;

public class StrategyOne implements StrategyInterface {
    @Override
    public String sendNotification(String msg) {
        return msg + " One";
    }
}
