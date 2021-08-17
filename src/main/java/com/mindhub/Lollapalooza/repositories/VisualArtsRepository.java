package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.VisualArts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VisualArtsRepository extends JpaRepository<VisualArts, Long> {
}
