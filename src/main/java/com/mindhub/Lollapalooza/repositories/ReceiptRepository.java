package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Recipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReceiptRepository extends JpaRepository<Recipt, Long> {
}
