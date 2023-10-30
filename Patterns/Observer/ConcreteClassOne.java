package Observer;

public class ConcreteClassOne extends AbsConcreteClass {
    public ConcreteClassOne() {
        super();
    }

    @Override
    public String notifyEvent() {
        System.out.println("pego Classe 1");
        return "pego Classe 1";
    }
}
