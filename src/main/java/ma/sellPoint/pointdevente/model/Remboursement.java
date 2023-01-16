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
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long remboursementId;
    private Date dateRemboursement;
    private Double montant;
    private String motif;
    private String methode;
    @OneToOne
    private Commande commande;
    @ManyToMany(mappedBy = "remboursements")
    private List<Comptabilite> comptabilites;
}
