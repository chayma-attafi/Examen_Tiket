package tn.esprit.examen_ticket.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategorie")
    Long idCategorie;

    String codeCategorie,nomcategorie;

    //cascade tet7at filclass fils
    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "categorieList",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Evenement> evenementList=new ArrayList<>();

}
