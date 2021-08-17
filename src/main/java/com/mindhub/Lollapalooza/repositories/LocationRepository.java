package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
