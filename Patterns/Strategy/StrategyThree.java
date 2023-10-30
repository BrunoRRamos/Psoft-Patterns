package Strategy;

public class StrategyThree implements StrategyInterface {
    @Override
    public String sendNotification(String msg) {
        return msg + " Three";
    }
}
