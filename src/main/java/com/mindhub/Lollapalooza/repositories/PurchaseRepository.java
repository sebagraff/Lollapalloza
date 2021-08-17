package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
