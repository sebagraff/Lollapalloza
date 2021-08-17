package com.mindhub.Lollapalooza.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mindhub.Lollapalooza.models.Festival;

@RepositoryRestResource
public interface FestivalRepository extends JpaRepository<Festival, Long> {
}
