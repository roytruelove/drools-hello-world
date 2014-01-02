package se.waymark.drools.action;

import se.waymark.drools.message.Message;

public class Action {
    public void performAction(Message message) {
        message.printMessage();
    }
}

