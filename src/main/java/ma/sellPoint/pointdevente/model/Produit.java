package ma.sellPoint.pointdevente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produitId;
    private String nom;
    private int quantite;
    private String description;
    private String marque;
    private String categorie;
    private String image;
    @OneToOne
    private Stock stock;
    @ManyToMany
    private List<Achat> achats;
    @ManyToMany
    private List<Ticket> tickets;
}
