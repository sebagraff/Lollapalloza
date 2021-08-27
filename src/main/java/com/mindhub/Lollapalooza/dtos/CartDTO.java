package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.ProductInCart;

import java.util.Set;
import java.util.stream.Collectors;

public class CartDTO {

    private long id;
    private Set<ProductInCartDTO> productsInCart;
    private Double totalPrice;
    public CartDTO() {
    }

    public CartDTO(Cart cart) {
        this.productsInCart = cart.getProductsInCart().stream().map(ProductInCartDTO::new).collect(Collectors.toSet());
        this.totalPrice = cart.getTotalPrice();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<ProductInCartDTO> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(Set<ProductInCartDTO> productsInCart) {
        this.productsInCart = productsInCart;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
