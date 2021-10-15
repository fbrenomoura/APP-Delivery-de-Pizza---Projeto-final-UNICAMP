package com.breno.pizza_projetocoursera;

public class OrderDetails {
    public String size;
    public float totalPrice;
    public String flavor;
    public String address;

    public OrderDetails(){
        setSize("");
        plusSetTotalPrice(0);
        setFlavor("");
        setAddress("");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void plusSetTotalPrice(float totalPrice) {
        this.totalPrice += totalPrice;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void restart(){
        setSize("");
        totalPrice = 0;
        setFlavor("");
        setAddress("");
    }
}
