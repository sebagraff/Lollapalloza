package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PhotoRepository extends JpaRepository<Photo,Long> {
    Photo findById (long id);

}
