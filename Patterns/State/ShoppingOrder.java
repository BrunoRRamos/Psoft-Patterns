package State;

public class ShoppingOrder {
    private ShoppingOrderState state;

    public ShoppingOrder() {
        this.state = new NewOrderPending(this);
    }

    public void setState(ShoppingOrderState newState) {
        this.state = newState;
        System.out.println("O pedido está agora como: " + this.getStateName() + "\n");
    }

    public ShoppingOrderState getState() {
        return this.state;
    }

    public String getStateName() {
        return this.state.getName();
    }

    public void appovePayment() {
        this.state.appovePayment();
    }

    public void regectPayment() {
        this.state.rejectPayment();
    }

    public void awaiPayment() {
        this.state.awaiPayment();
    }

    public void shipOrder() {
        this.state.shipOrder();
    }
}
