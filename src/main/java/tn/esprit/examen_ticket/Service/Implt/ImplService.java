package tn.esprit.examen_ticket.Service.Implt;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examen_ticket.Entity.Categorie;
import tn.esprit.examen_ticket.Entity.Evenement;
import tn.esprit.examen_ticket.Entity.Internaute;
import tn.esprit.examen_ticket.Repository.CategorieRepository;
import tn.esprit.examen_ticket.Repository.EvenementRepository;
import tn.esprit.examen_ticket.Repository.InternauteRepository;
import tn.esprit.examen_ticket.Service.Interface.IService;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class ImplService implements IService {
    InternauteRepository internauteRepository;
    EvenementRepository evenementRepository;
    CategorieRepository categorieRepository;

    @Override
    public Internaute ajouterInternaute(Internaute internaute) {
        return internauteRepository.save(internaute);
    }

    @Override
    public Evenement addEvent(Evenement evenement) {
        return evenementRepository.save(evenement);
    }
    @Transactional
    @Override
    public Evenement ajouterEvenement(Evenement evenement) {

        Evenement evenemensaved = evenementRepository.save(evenement);

    /*  for(Categorie c : evenement.getCategorieList()){

            // Affectation de la catégorie à l'événement
            evenement.getCategorieList().add(c);

            // Sauvegarde de la catégorie
            categorieRepository.save(c);
        }

        // Sauvegarde de l'événement après avoir effectué toutes les associations nécessaires
        return evenemensaved;*/

        Categorie categorie = new Categorie();
        evenement.getCategorieList().add(categorie);
        categorieRepository.save(categorie);
        return null;

    }

   // @Scheduled(fixedRate = 15000)
   // @Transactional
    @Override
    public void listeRevenmentsParCategorie() {
     /*   List<Categorie> categorieList = categorieRepository.findAll();
        for(Categorie categorie: categorieList )
        {
            log.info("Categorie");
            log.info(String.valueOf(categorie.getNomcategorie()));
            for(Evenement evenement: categorie.getEvenementList())
            {
                log.info("Evenement");
                log.info(String.valueOf(evenement.getNomEvenement()));
            }

        }*/

    }




}
