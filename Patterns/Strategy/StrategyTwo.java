package Strategy;

public class StrategyTwo implements StrategyInterface {
    @Override
    public String sendNotification(String msg) {
        return msg + " Two";
    }
}
