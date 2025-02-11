package com.example.statemachine.states;

import com.example.statemachine.context.OrderContext;

public interface OrderState {
    void next(OrderContext ctx);
    void printStatus();
}
