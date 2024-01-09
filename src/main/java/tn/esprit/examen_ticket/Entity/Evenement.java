package tn.esprit.examen_ticket.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Evenement")
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvenement")
    Long idEvenement;

    String nomEvenement;
    Long nbPlacesRestants;
    LocalDate dateEvnemeny;

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "evenement",fetch = FetchType.EAGER)
    List<Ticket> ticketList=new ArrayList<>();

    @ToString.Exclude
    //@JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    List<Categorie> categorieList=new ArrayList<>();


}
