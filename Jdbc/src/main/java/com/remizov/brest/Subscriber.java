package com.remizov.brest;

public class Subscriber {
    private int subscriberId;
    private String subscriberLastname;
    private int subscriberPhone;

    public Subscriber(int subscriberId, String subscriberLastname, int subscriberPhone) {
        this.subscriberId = subscriberId;
        this.subscriberLastname = subscriberLastname;
        this.subscriberPhone = subscriberPhone;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberId=" + subscriberId +
                ", subscriberLastname='" + subscriberLastname + '\'' +
                ", subscriberPhone=" + subscriberPhone +
                '}';
    }
}
