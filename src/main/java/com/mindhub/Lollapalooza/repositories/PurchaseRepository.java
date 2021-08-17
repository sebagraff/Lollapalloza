package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PurchaseRepository extends JpaRepository<Product, Long> {
}
