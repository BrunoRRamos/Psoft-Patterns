package State;

public class Main {
    public static void main(String[] args) {
        ShoppingOrder order = new ShoppingOrder();

        order.awaiPayment();
        order.appovePayment();
        order.appovePayment();
        order.regectPayment();
        order.regectPayment();
        order.awaiPayment();
        order.appovePayment();
        order.shipOrder();
    }
}
