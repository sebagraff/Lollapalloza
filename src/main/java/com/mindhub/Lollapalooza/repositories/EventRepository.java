package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EventRepository extends JpaRepository<Event, Long> {
}
