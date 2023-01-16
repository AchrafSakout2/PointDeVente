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
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private Date dateTicket;
    @OneToOne
    private Client client;
    @ManyToMany(mappedBy = "tickets")
    private List<Produit> produits;
    private Double prixTotal;
    @OneToOne
    private Paiement paiement;
    @OneToOne
    private Commande commande;
    @ManyToOne
    private Caisse caisse;


}
