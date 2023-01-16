package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Caissier extends Employe{
    @ManyToOne()
    private Magasin magasin;
}
