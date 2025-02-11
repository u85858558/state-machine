package com.example.statemachine;

import com.example.statemachine.context.OrderContext;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.printStatus();
        order.nextState();

        order.printStatus();
        order.nextState();

        order.printStatus();
        order.nextState();

        order.printStatus();
        order.nextState();
    }
}
