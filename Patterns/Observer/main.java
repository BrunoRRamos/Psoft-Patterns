package Observer;

public class main {
    public static void main(String[] args) {
        ConcreteClassOne pessoa1 = new ConcreteClassOne();
        ConcreteClassTwo pessoa2 = new ConcreteClassTwo();
        Source evento = new Source();

        evento.addListener(pessoa1);
        evento.addListener(pessoa2);

        System.out.println(evento.eventTrigger());
    }
}
