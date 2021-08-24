package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CartRepository extends JpaRepository<Cart,Long> {
}
