package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.ProductInCart;

import java.util.Set;

public class CartDTO {

    private long id;
    private Set<ProductInCart> productsInCart;

    public CartDTO() {
    }

    public CartDTO(Cart cart) {
        this.productsInCart = cart.getProductsInCart();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<ProductInCart> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(Set<ProductInCart> productsInCart) {
        this.productsInCart = productsInCart;
    }
}
