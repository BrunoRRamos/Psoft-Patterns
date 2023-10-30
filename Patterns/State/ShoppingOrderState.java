package State;

public interface ShoppingOrderState {
    public String getName();
    public void  appovePayment();
    public void rejectPayment();
    public void  awaiPayment();
    public void  shipOrder();
}
