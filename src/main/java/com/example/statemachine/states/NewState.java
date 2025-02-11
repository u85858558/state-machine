package com.example.statemachine.states;

import com.example.statemachine.context.OrderContext;

public class NewState implements OrderState {
    @Override
    public void next(OrderContext ctx) {
        ctx.setState(new ProcessingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in NEW state.");
    }
}
