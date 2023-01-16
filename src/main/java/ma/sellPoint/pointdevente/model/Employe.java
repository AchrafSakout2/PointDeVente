package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeId;
    private String nom;
    private String prenom;
    private String adresse;
    private String nTelephone;
    private String post;
    @ManyToMany(mappedBy = "employes")
    private List<Commande> commandes;
    @ManyToOne
    private Caisse caisse;
}
