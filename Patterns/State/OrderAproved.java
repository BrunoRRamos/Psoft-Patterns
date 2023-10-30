package State;

public class OrderAproved implements ShoppingOrderState {

    private ShoppingOrder order;
    private String name;

    public OrderAproved(ShoppingOrder shoppingOrder) {
        this.order = shoppingOrder;
        this.name = "Order Aproved !";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void appovePayment() {
        System.out.println("Pedido já está no estado Aprovado");
    }

    @Override
    public void rejectPayment() {
        this.order.setState(new RejectedOrder(this.order));
    }

    @Override
    public void awaiPayment() {
        this.order.setState(new NewOrderPending(this.order));
    }

    @Override
    public void shipOrder() {
        System.out.println("Pedido ENVIADO !");
    }
}
