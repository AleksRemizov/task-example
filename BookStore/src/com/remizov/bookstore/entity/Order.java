package com.remizov.bookstore.entity;

public class Order {
    private long orderId;
    private long customerId;
    private  long sellerId;
    private long [] books;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public long[] getBooks() {
        return books;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }

    public Order(long orderId, long customerId, long sellerId, long[] books) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.sellerId = sellerId;
        this.books = books;
    }
}
