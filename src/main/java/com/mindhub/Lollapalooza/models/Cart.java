package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy="cart", fetch=FetchType.EAGER)
    Set<ProductInCart> productsInCart;

    public Cart() {
    }

    public Cart(long id, Set<ProductInCart> productsInCart) {
        this.id = id;
        this.productsInCart = productsInCart;
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
