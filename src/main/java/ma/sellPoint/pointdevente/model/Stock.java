package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    private int quantite;
    private int seuilReaprovisionnement;
    @OneToOne(mappedBy = "stock")
    private Produit produit;
    @ManyToOne
    private Magasin magasin;
}
