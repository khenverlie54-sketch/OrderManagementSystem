package src.com.store.order;

public abstract class Order {

    private int orderId;
    private double amount;
    private OrderStatus status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        setAmount(amount);
        this.status = OrderStatus.PENDING;
    }

    // Abstract method (abstraction)
    public abstract void processOrder();

    // Concrete method
    public String getOrderSummary() {
        return "Order ID: " + orderId +
               ", Amount: $" + amount +
               ", Status: " + status;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    public void cancelOrder() {
        this.status = OrderStatus.CANCELLED;
    }

    protected void markAsPaid() {
        this.status = OrderStatus.PAID;
    }
}