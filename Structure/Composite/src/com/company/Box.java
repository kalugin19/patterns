package com.company;

public class Box implements  Product {

    private Product[] childList;

    public void setChildList(Product...products) {
        this.childList = products;
    }

    @Override
    public float getPrice() {
        float price = 0;
        if (childList!=null && childList.length > 0){
            for (Product product: childList){
                price += product.getPrice();
            }
        }
        return price;
    }
}
