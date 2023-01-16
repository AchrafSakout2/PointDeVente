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
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fournisseurId;
    private String nom;
    private String prenom;
    private String adress;
    private String nTelephone;
    @OneToMany(mappedBy = "fournisseur")
    private List<Achat> achats;
    @OneToMany(mappedBy = "fournisseur")
    private List<Livraison> livraisons;
}
