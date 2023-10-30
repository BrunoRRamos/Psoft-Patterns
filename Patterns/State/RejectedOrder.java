package State;

public class RejectedOrder implements ShoppingOrderState {

    private ShoppingOrder order;
    private String name;

    public RejectedOrder(ShoppingOrder shoppingOrder) {
        this.order = shoppingOrder;
        this.name = "Order Rejected !";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void appovePayment() {
        this.order.setState(new OrderAproved(this.order));
    }

    @Override
    public void rejectPayment() {
        System.out.println("Pedido já está recusado");
    }

    @Override
    public void awaiPayment() {
        this.order.setState(new NewOrderPending(this.order));
    }

    @Override
    public void shipOrder() {
        System.out.println("Pedido ainda não foi rejeitado");
    }
}
