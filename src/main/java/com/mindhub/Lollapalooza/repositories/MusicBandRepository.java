package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.MusicBand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MusicBandRepository extends JpaRepository<MusicBand, Long> {
}
