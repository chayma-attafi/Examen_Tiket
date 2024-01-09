package tn.esprit.examen_ticket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen_ticket.Entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
