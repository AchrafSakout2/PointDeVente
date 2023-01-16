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
public class HistoriqueCommandes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historiqueId;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes;
    @OneToOne(fetch = FetchType.LAZY)
    private Client client;
}
