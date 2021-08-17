package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.ClientEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientEventRepository extends JpaRepository<ClientEvent, Long> {
}
