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
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caisseId;
    @OneToMany(mappedBy = "caisse")
    private List<Ticket> tickets;
    @OneToMany(mappedBy = "caisse")
    private List<Employe> employes;

}
