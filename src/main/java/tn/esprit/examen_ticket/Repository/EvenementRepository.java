package tn.esprit.examen_ticket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen_ticket.Entity.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement,Long> {

   // List<Evenement> findByCategorieList
}
