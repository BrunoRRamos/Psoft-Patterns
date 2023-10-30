package State;

public class NewOrderPending implements ShoppingOrderState {

    private ShoppingOrder order;
    private String name;

    public NewOrderPending(ShoppingOrder shoppingOrder) {
        this.order = shoppingOrder;
        this.name = "Order Pending !";
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
        this.order.setState(new RejectedOrder(this.order));
    }

    @Override
    public void awaiPayment() {
        System.out.println("Pedido já está no estado pendendte");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pedido ainda não foi aprovado");
    }
}
