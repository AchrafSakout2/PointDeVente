package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Livraison {
    @Id
    private Long livraisonId;
    private Date dateCommande;
    private String statut;
    @OneToOne(mappedBy = "livraison")
    private Commande commande;
    @ManyToOne
    private Fournisseur fournisseur;
}
