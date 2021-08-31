package com.remizov.brest.entity;

public class Subscriber extends Entity{
    private int subscriberId;
    private String subscriberLastname;
    private int subscriberPhone;

    public Subscriber() {
    }

    public Subscriber(int subscriberId, String subscriberLastname, int subscriberPhone) {
        this.subscriberId = subscriberId;
        this.subscriberLastname = subscriberLastname;
        this.subscriberPhone = subscriberPhone;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberLastname() {
        return subscriberLastname;
    }

    public void setSubscriberLastname(String subscriberLastname) {
        this.subscriberLastname = subscriberLastname;
    }

    public int getSubscriberPhone() {
        return subscriberPhone;
    }

    public void setSubscriberPhone(int subscriberPhone) {
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
