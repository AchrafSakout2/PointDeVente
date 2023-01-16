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
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long magasinId;
    private String nom;
    private String logo;
    private String adresse;
    @OneToOne(mappedBy = "magasin")
    private Responsable responsable;
    @OneToMany(mappedBy = "magasin")
    private List<Caissier> caissiers;
    @OneToMany(mappedBy = "magasin")
    private List<Stock> stocks;
    @OneToOne(mappedBy = "magasin")
    private Comptabilite comptabilite;
}
