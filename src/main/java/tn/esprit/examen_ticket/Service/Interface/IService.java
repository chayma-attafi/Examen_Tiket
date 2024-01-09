package tn.esprit.examen_ticket.Service.Interface;

import tn.esprit.examen_ticket.Entity.Evenement;
import tn.esprit.examen_ticket.Entity.Internaute;

public interface IService {
    Internaute ajouterInternaute(Internaute internaute);

    Evenement ajouterEvenement(Evenement evenement);

    void listeRevenmentsParCategorie();
    public Evenement addEvent(Evenement evenement);
}
