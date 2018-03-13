package com.example.microservices.limitsservice.bean;

/**
 * Created by Muhammad.Asim on 3/13/2018.
 */
public class LimitConfiguration {
    private int maximum;
    private int minimum;

    protected LimitConfiguration() {

    }

    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

}
