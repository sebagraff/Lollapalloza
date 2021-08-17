package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.MusicBand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicBandRepository extends JpaRepository<MusicBand, Long> {
}
