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
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commandeId;
    private Date dateCommande;
    private Double prixTotal;
    private String etat;
    private String adresseLivraison;
    @OneToMany(mappedBy = "commande",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> produits;
    @ManyToMany
    private List<Employe> employes;
    @OneToOne
    private Livraison livraison;
    @OneToOne(mappedBy = "commande")
    private Remboursement remboursement;
    @ManyToMany(mappedBy = "commandes")
    private List<Comptabilite> comptabilites;
    @OneToOne(mappedBy = "commande")
    private Paiement paiement;
    @OneToOne(mappedBy = "commande")
    private Ticket ticket;
}
