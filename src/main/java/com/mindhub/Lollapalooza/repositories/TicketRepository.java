package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
