package tn.esprit.examen_ticket.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen_ticket.Entity.Enum.TrancheAge;

import  java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Internaute")
public class Internaute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInternaute")
    Long idInternaute;


    Long identifiant;

    @Enumerated(EnumType.STRING)
    TrancheAge trancheAge;

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "internaute",fetch = FetchType.EAGER)
    List<Ticket> ticketList=new ArrayList<>();



}
