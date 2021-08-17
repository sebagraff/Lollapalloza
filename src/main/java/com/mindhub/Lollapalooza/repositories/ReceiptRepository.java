package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
