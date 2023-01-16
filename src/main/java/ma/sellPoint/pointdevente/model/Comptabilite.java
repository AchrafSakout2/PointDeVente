package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Comptabilite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comptabiliteId;
    private Date dateDebut;
    private Date dateFin;
    private Double beneficesTotaux;
    @ManyToMany
    private List<Remboursement> remboursements;
    @ManyToMany
    private List<Commande> commandes;
    @ManyToMany
    private List<Paiement> paiements;
    @OneToOne
    private Magasin magasin;

}
