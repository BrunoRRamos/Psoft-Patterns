package Strategy;

public class Main {
    public static void main(String[] args) {
        RequestUse requestUse = new RequestUse();

        System.out.println(requestUse.notificar("Usando estrategia:"));
        requestUse.setStrategyTwo();
        System.out.println(requestUse.notificar("Usando estrategia:"));
        requestUse.setStrategyThree();
        System.out.println(requestUse.notificar("Usando estrategia:"));
    }
}
