package ma.sellPoint.pointdevente.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Responsable extends Employe{
    @OneToOne
    private Magasin magasin;

}
