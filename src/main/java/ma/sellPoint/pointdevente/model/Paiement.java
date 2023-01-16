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
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paiementId;
    private Date datePaiement;
    private Double montant;
    private String typePaiement;
    private String etatCommande;
    private String adresseLivraison;
    @ManyToMany(mappedBy = "paiements")
    private List<Comptabilite> comptabilites;
    @OneToOne
    private Commande commande;
    @OneToOne(mappedBy = "paiement")
    private Ticket ticket;

}
