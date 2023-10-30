package Strategy;

public class RequestUse {
    private StrategyInterface useStrategyInterface;

    public RequestUse() {
        this.useStrategyInterface = new StrategyOne();
    }

    public String notificar (String msg) {
        return useStrategyInterface.sendNotification(msg);
    }

    public void setStrategyOne() {
        this.useStrategyInterface = new StrategyOne();
    }

    public void setStrategyTwo() {
        this.useStrategyInterface = new StrategyTwo();
    }

    public void setStrategyThree() {
        this.useStrategyInterface = new StrategyThree();
    }
}
