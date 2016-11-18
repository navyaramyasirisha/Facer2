package com.we_are_infinity.facer.LOGIC.EVENT;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */

public class ErrorMessageEvent {

    String message;

    public ErrorMessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
