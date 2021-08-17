package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailsRepository extends JpaRepository<Details, Long> {
}
