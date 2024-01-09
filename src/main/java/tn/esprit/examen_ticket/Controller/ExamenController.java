package tn.esprit.examen_ticket.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen_ticket.Entity.Evenement;
import tn.esprit.examen_ticket.Entity.Internaute;
import tn.esprit.examen_ticket.Service.Interface.IService;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class ExamenController {
    IService iService;

    @PostMapping("/ajouterInternaute")
    public Internaute ajouterInternaute(@RequestBody Internaute internaute) {
        return iService.ajouterInternaute(internaute);
    }

    @PostMapping("/ajouterEvenement")
    public Evenement ajouterEvenement(@RequestBody Evenement evenement) {
        return iService.ajouterEvenement(evenement);
    }

    @GetMapping("/listeRevenmentsParCategorie")
    public void listeRevenmentsParCategorie() {
        iService.listeRevenmentsParCategorie();
    }



    @PostMapping("/addEvent")
    public Evenement addEvent(@RequestBody Evenement evenement) {
        return iService.addEvent(evenement);
    }
}
