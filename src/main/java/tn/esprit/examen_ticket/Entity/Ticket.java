package tn.esprit.examen_ticket.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen_ticket.Entity.Enum.TypeTicket;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Ticket")
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket")
    Long idTicket;

    String CodeTicket;
    Double prixTicket;

    @Enumerated(EnumType.STRING)
    TypeTicket typeTicket;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    Internaute internaute;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    Evenement evenement;

}
