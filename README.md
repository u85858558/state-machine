# State-Machine

How It Works?
- OrderContext manages the current state of an order.
- Each state (NewState, ProcessingState, etc.) implements OrderState and defines its own transition.
- The Main class creates an order and transitions it through different states.