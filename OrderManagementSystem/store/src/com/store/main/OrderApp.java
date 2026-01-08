package src.com.store.main;

import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        // Add orders
        orders.add(new OnlineOrder(101, 250.50));
        orders.add(new OnlineOrder(102, 99.99));
        orders.add(new OnlineOrder(103, 150.00));

        // Cancel one order (encapsulation preserved)
        orders.get(2).cancelOrder();

        // Iterator traversal
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderSummary());

            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
                System.out.println("Cancelled order removed.");
            }
        }
    }
}
