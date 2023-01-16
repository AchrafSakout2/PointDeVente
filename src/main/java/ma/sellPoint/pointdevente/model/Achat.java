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
public class Achat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long achatId;
    private Date date;
    private Double prixTotal;
    @ManyToMany(mappedBy = "achats")
    private List<Produit> produits;
    @ManyToOne
    private Fournisseur fournisseur;
}
