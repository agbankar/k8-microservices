package com;

public class Order {
    private int orderId;
    private String itemName;

    public Order(int orderId, String itemName) {
        this.orderId = orderId;
        this.itemName = itemName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
