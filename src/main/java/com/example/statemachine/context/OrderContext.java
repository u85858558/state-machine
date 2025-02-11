package com.example.statemachine.context;

import com.example.statemachine.states.NewState;
import com.example.statemachine.states.OrderState;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewState(); // Initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
