package ma.sellPoint.pointdevente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String nom;
    private String prenom;
    private String adresse;
    private String nTelephone;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "client",
            orphanRemoval = true)
    private HistoriqueCommandes historiqueCommandes;
}
