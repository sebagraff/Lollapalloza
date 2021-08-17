package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivalRepository extends JpaRepository<Festival, Long> {
}
