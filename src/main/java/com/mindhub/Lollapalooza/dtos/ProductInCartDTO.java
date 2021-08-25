package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.ProductInCart;

public class ProductInCartDTO {

    private long productId;
    private String productName;
    private int productQuantity;
    private double productPrice;

    public ProductInCartDTO() {
    }

    public ProductInCartDTO(ProductInCart productInCart) {

        this.productName = productInCart.getProductName();
        this.productQuantity = productInCart.getProductQuantity();
        this.productPrice = productInCart.getProductPrice();
    }





    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
