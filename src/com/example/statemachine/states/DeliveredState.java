package src.com.example.statemachine.states;

import src.com.example.statemachine.context.OrderContext;

public class DeliveredState implements OrderState {
    @Override
    public void next(OrderContext ctx) {
        System.out.println("Order is already DELIVERED. No further transitions.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is DELIVERED.");
    }
}
