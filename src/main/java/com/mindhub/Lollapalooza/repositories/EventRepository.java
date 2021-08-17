package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
