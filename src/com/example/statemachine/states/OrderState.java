package src.com.example.statemachine.states;

import src.com.example.statemachine.context.OrderContext;

public interface OrderState {
    void next(OrderContext ctx);
    void printStatus();
}
