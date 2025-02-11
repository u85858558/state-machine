package com.example.statemachine.states;

import com.example.statemachine.context.OrderContext;

public class ProcessingState implements OrderState {
    @Override
    public void next(OrderContext ctx) {
        ctx.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is being PROCESSED.");
    }
}
