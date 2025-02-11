package src.com.example.statemachine.states;

import src.com.example.statemachine.context.OrderContext;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext ctx) {
        ctx.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been SHIPPED.");
    }
}
