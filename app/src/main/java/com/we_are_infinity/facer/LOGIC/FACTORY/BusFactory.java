package com.we_are_infinity.facer.LOGIC.FACTORY;

import com.squareup.otto.Bus;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */
public class BusFactory {
    private static Bus ourInstance = new Bus();

    public static com.squareup.otto.Bus getInstance() {
        return ourInstance;
    }

}
