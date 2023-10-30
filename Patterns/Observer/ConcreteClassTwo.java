package Observer;

public class ConcreteClassTwo extends AbsConcreteClass {
    public ConcreteClassTwo() {
        super();
    }

    @Override
    public String notifyEvent() {
        System.out.println("pego Classe 2");
        return "pego Classe 2";
    }
}
